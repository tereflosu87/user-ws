package com.ecomerce.userws.mapper;

import com.ecomerce.userws.dto.User;
import com.ecomerce.userws.dto.UserDTO;

public class UserMapperImpl implements UserMapper{

    @Override
    public UserDTO userToUserDto(User user) {
        if (user == null){
            return null;
        }

        UserDTO userDto = new UserDTO();
        userDto.setBookId(user.getBookId());
        userDto.setDni(user.getDni());
        userDto.setIdUser(user.getIdUser());
        userDto.setName(user.getName());

        return userDto;
    }
}
