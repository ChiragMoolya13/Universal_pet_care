package com.chiragproject.universalpetcare.factory;

import com.chiragproject.universalpetcare.model.User;
import com.chiragproject.universalpetcare.request.RegistrationRequest;

public interface UserFactory {
    public User createUser(RegistrationRequest registrationRequest);
}
