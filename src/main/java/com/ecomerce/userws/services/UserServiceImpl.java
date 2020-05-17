package com.ecomerce.userws.services;

import com.ecomerce.userws.dto.User;
import com.ecomerce.userws.repositories.UserRepositoy;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepositoy userRepositoy;

    public UserServiceImpl(UserRepositoy userRepositoy) {
        this.userRepositoy = userRepositoy;
    }

    @Override
    public User saveUser(User user) {
        return userRepositoy.save(user);
    }
}
