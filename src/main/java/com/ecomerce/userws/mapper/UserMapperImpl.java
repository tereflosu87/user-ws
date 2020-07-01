package com.ecomerce.userws.mapper;

import com.ecomerce.userws.dto.User;
import com.ecomerce.userws.dto.UserRequest;

public class UserMapperImpl implements UserMapper{

    @Override
    public UserRequest userToUserDto(User user) {
        if (user == null){
            return null;
        }

        UserRequest userDto = new UserRequest();
        userDto.setBookId(user.getBookId());
        userDto.setDni(user.getDni());
        userDto.setIdUser(user.getIdUser());
        userDto.setName(user.getName());

        return userDto;
    }
}
