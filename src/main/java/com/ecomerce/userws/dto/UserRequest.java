package com.ecomerce.userws.dto;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

    private Long idUser;
    private String dni;
    private String name;
    private String bookId;

    public UserRequest(Long idUser, String dni, String name, String bookId) {
        this.idUser = idUser;
        this.dni = dni;
        this.name = name;
        this.bookId = bookId;
    }

}
