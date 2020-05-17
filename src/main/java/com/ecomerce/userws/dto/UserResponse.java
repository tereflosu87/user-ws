package com.ecomerce.userws.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {

    private Long idUser;
    private String dni;
    private String name;
    private String bookId;

    public UserResponse(Long idUser, String dni, String name, String bookId) {
        this.idUser = idUser;
        this.dni = dni;
        this.name = name;
        this.bookId = bookId;
    }

}
