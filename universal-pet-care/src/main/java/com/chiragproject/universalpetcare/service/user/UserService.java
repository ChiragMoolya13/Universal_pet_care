package com.chiragproject.universalpetcare.service.user;

import com.chiragproject.universalpetcare.factory.UserFactory;
import com.chiragproject.universalpetcare.model.User;
import com.chiragproject.universalpetcare.repository.UserRepository;
import com.chiragproject.universalpetcare.request.RegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserFactory userFactory;

    public User add(RegistrationRequest request) {
       return userFactory.createUser(request);
    }
}
