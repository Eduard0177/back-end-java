package com.aula02.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula02.demo.Exception.UserNotFoundException;

import com.aula02.demo.Model.User;
import com.aula02.demo.Repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User login (String userName, String passWord) throws UserNotFoundException{
        User userSearch = userRepository.findByUsernameAndPassWord(userName, passWord);
        if(userSearch!=null){
            return userSearch;
        }
        throw new UserNotFoundException(userName);

    } 

    
    
}
