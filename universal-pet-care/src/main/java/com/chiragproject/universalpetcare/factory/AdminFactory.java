package com.chiragproject.universalpetcare.factory;

import com.chiragproject.universalpetcare.model.Admin;
import com.chiragproject.universalpetcare.model.User;
import com.chiragproject.universalpetcare.repository.AdminRepository;
import com.chiragproject.universalpetcare.repository.PatientRepository;
import com.chiragproject.universalpetcare.request.RegistrationRequest;
import com.chiragproject.universalpetcare.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminFactory {
    private final AdminRepository adminRepository;
    private final UserAttributesMapper userAttributesMapper;
    public Admin createAdmin(RegistrationRequest request) {
        Admin admin = new Admin();
        userAttributesMapper.setCommonAttributes(request,admin);
        return adminRepository.save(admin);
    }
}
