package com.ecomerce.userws.mapper;

import com.ecomerce.userws.dto.User;
import com.ecomerce.userws.dto.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCIA= Mappers.getMapper(UserMapper.class);

    UserRequest userToUserDto(User persona);

}

