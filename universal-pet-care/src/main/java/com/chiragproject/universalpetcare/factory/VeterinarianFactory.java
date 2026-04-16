package com.chiragproject.universalpetcare.factory;

import com.chiragproject.universalpetcare.model.User;
import com.chiragproject.universalpetcare.model.Veterinarian;
import com.chiragproject.universalpetcare.repository.VeterinarianRepository;
import com.chiragproject.universalpetcare.request.RegistrationRequest;
import com.chiragproject.universalpetcare.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VeterinarianFactory {
    private final VeterinarianRepository veterinarianRepository;
    private final UserAttributesMapper userAttributesMapper;

    public Veterinarian createVeterinarian(RegistrationRequest request) {
        Veterinarian veterinarian = new Veterinarian();
        userAttributesMapper.setCommonAttributes(request, veterinarian);
        veterinarian.setSpecialization(request.getSpecialization());
        return veterinarianRepository.save(veterinarian);
    }
}
