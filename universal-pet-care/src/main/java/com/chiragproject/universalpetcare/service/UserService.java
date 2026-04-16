package com.chiragproject.universalpetcare.service;

import com.chiragproject.universalpetcare.model.User;
import com.chiragproject.universalpetcare.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void add(User user) {
       userRepository.save(user);
    }
}
