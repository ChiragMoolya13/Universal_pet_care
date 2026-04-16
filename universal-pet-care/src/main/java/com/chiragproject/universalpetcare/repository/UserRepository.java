package com.chiragproject.universalpetcare.repository;

import com.chiragproject.universalpetcare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByEmail(String email);
}
