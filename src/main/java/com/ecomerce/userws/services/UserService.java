package com.ecomerce.userws.services;

import com.ecomerce.userws.dto.User;

public interface UserService {

    User findByName (String name);

    Boolean exitsUser(String dni);


}
