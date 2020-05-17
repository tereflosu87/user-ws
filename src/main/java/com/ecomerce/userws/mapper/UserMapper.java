package com.ecomerce.userws.mapper;

import com.ecomerce.userws.dto.User;
import com.ecomerce.userws.dto.UserRequest;

@Mappper
public interface UserMapper {

    UserMapper INSTANCIA= Mappers.getMapper(UserMapper.class);

    UserRequest userToUserDto(User persona);

}
