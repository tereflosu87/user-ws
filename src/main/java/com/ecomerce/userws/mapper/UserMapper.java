package com.ecomerce.userws.mapper;

import com.ecomerce.userws.dto.User;
import com.ecomerce.userws.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper instance= Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDto(User persona);

}

