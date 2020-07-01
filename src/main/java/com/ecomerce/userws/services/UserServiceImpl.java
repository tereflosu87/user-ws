package com.ecomerce.userws.services;

import com.ecomerce.userws.dto.User;
import com.ecomerce.userws.repositories.UserRepositoy;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepositoy userRepositoy;

    public UserServiceImpl(UserRepositoy userRepositoy) {
        this.userRepositoy = userRepositoy;
    }


    public User findByName(String name) {
        return userRepositoy.findByName(name);
    }

    public Boolean exitsUser(String dni){
        return userRepositoy.existsById(Long.valueOf(dni));
    }
}
