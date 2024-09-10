package com.aula02.demo.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class User {
    @Id
    @GeneratedValue

    private Long id;

    private String userName;
    private String passWord;
    private String email;
    private String cpf;
    private String adress;
    private Short age;
    
    
}
