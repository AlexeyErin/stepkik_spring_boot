package com.example.demo.model.dao;

import com.example.demo.model.entity.Users;
import com.example.demo.model.repository.UsersRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class UsersDao {

    private final UsersRepository usersRepository;

    public Users createUser(Users users){
        return usersRepository.save(users);
    }

    public Users findUserById(Long id){
        return usersRepository.findById(id).orElse(null);
    }

    public Users findUserByLogin(String login){
        return usersRepository.findByLogin(login).orElse(null);
    }
}
