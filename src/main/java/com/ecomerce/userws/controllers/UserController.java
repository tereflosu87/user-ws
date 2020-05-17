package com.ecomerce.userws.controllers;

import com.ecomerce.userws.dto.User;
import com.ecomerce.userws.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public User findByDni(){
        return new User(1L, "74733666K", "Teresa Flores", "25");
    }

    @PostMapping("/user/update")
    public User updateUser(@RequestBody User user){
        return userService.saveUser(user);
    }

}
