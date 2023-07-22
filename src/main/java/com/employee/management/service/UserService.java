package com.employee.management.service;

import com.employee.management.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAllUsers();
    Optional<User> findById(Long id);
    User saveUser(User employeeEntity);
    User updateUser(User employeeEntity);
    void deleteUser(Long id);
}
