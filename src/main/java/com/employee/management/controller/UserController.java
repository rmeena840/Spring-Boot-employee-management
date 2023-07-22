package com.employee.management.controller;

import com.employee.management.entity.User;
import com.employee.management.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public User saveEmployee(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping
    public User updateEmployee(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }
}
