package com.aula02.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula02.demo.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    
    public User findByUsernameAndPassWord(String username, String passWord);

}
