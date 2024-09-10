package com.aula02.demo.Controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula02.demo.Service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //Rotas do CRUD
    
    @PostMapping
    public boolean UserLogin(@RequestBody User user) {
        String passWord = user.getPassword();
        String userName = user.getUsername();
        try {
            User userLogin = userService.login(userName, passWord);
            return true;
        } catch (Exception l) {
            return false;
        }


    }
    
}
