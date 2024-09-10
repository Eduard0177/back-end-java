package com.aula02.demo.Exception;

public class UserNotFoundException extends Exception {
    
    public UserNotFoundException(String id) {
        super("Usuário não encontrado" + id);
    }

}
