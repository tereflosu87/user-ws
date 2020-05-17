package com.ecomerce.userws.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private Long idUser;
    private String dni;
    private String name;
    private String bookId;

    public UserDTO(Long idUser, String dni, String name, String bookId) {
        this.idUser = idUser;
        this.dni = dni;
        this.name = name;
        this.bookId = bookId;
    }

    public UserDTO() {

    }
}
