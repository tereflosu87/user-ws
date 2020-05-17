package com.ecomerce.userws.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String dni;
    private String name;
    private String bookId;

    public User(Long idUser, String dni, String name, String bookId) {
        this.idUser = idUser;
        this.dni = dni;
        this.name = name;
        this.bookId = bookId;
    }

}
