package com.example.demo.model.repository;

import com.example.demo.model.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface UsersRepository extends PagingAndSortingRepository<Users, Long>, CrudRepository<Users, Long> {

    Optional<Users> findByLogin(String login);
}
