package com.ecomerce.userws.mapper;

import com.ecomerce.userws.dto.User;
import com.ecomerce.userws.dto.UserRequest;

//@Mapper
public interface UserMapper {

   // UserMapper instance= Mappers.getMapper(UserMapper.class);

    UserRequest userToUserDto(User persona);

}

