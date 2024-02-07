package com.example.demo.model.services;

import com.example.demo.model.dao.UsersDao;
import com.example.demo.model.entity.Users;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class UsersServiceImpl implements UsersService{

    private final UsersDao usersDao;

    @Override
    public Users createUser(Users user) {
        log.info("creating new user");
        return usersDao.createUser(user);
    }

    public Users findUserByLogin(String login){
        log.info("searching user by login");
        return usersDao.findUserByLogin(login);
    }
}
