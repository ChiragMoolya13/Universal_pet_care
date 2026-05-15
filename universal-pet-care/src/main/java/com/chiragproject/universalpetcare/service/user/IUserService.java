package com.chiragproject.universalpetcare.service.user;

import com.chiragproject.universalpetcare.dto.UserDto;
import com.chiragproject.universalpetcare.model.User;
import com.chiragproject.universalpetcare.request.RegistrationRequest;
import com.chiragproject.universalpetcare.request.UserUpdateRequest;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    User register(RegistrationRequest request);

    User update(Long userId, UserUpdateRequest request);

    User findById(Long userId);

    void delete(Long userId);

    List<UserDto> getAllUsers();

    UserDto getUserWithDetails(Long userId) throws SQLException;
}
