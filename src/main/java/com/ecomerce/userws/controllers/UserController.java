package com.ecomerce.userws.controllers;

import com.ecomerce.userws.dto.User;
import com.ecomerce.userws.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
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


    @GetMapping("/user/findByName")
    public User findByName(String name){
        return userService.findByName(name);
    }

    @GetMapping("/user/exitsUser")
    public Boolean exitsUser(String dni){
        return userService.exitsUser(dni);
    }
}
