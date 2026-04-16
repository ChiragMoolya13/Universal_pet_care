package com.chiragproject.universalpetcare.factory;

import com.chiragproject.universalpetcare.model.Patient;
import com.chiragproject.universalpetcare.model.User;
import com.chiragproject.universalpetcare.repository.PatientRepository;
import com.chiragproject.universalpetcare.request.RegistrationRequest;
import com.chiragproject.universalpetcare.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientFactory {
    private final PatientRepository patientRepository;
    private final UserAttributesMapper userAttributesMapper;

    public Patient createPatient(RegistrationRequest request) {
        Patient patient = new Patient();
        userAttributesMapper.setCommonAttributes(request,patient);
        patient.setSpecialization(request.getSpecialization());
        return patientRepository.save(patient);
    }
}
