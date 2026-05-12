package com.chiragproject.universalpetcare.service.user;

import com.chiragproject.universalpetcare.dto.EntityConverter;
import com.chiragproject.universalpetcare.dto.UserDto;
import com.chiragproject.universalpetcare.exception.ResourceNotFoundException;
import com.chiragproject.universalpetcare.factory.UserFactory;
import com.chiragproject.universalpetcare.factory.VeterinarianFactory;
import com.chiragproject.universalpetcare.model.User;
import com.chiragproject.universalpetcare.repository.UserRepository;
import com.chiragproject.universalpetcare.request.RegistrationRequest;
import com.chiragproject.universalpetcare.request.UserUpdateRequest;
import com.chiragproject.universalpetcare.utils.FeedBackMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{
    private final UserRepository userRepository;
    private final UserFactory userFactory;
    private final VeterinarianFactory veterinarianFactory;
    private final EntityConverter<User, UserDto> entityConverter;

    @Override
    public User register(RegistrationRequest request) {
       return userFactory.createUser(request);
    }


    @Override
    public User update(Long userId, UserUpdateRequest request){
        User user = findById(userId);
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setGender(request.getGender());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setSpecialization(request.getSpecialization());
        return userRepository.save(user);
    }

    @Override
    public User findById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(()-> new ResourceNotFoundException(FeedBackMessage.RESOURCE_NOT_FOUND));
    }
    @Override
    public void delete(Long userId){
        userRepository.findById(userId).ifPresentOrElse(userRepository :: delete,()->{
            throw new ResourceNotFoundException(FeedBackMessage.RESOURCE_NOT_FOUND);
        });
    }

    @Override
    public List<UserDto> getAllUsers(){
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> entityConverter.mapEntityToDto(user, UserDto.class))
                .collect(Collectors.toList());
    }
}
