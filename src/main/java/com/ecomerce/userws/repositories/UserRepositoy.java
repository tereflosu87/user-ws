package com.ecomerce.userws.repositories;

import com.ecomerce.userws.dto.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositoy extends CrudRepository<User, Long> {

    User findByName (String name);

}
