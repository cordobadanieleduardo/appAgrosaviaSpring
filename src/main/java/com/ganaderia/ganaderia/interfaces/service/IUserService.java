package com.ganaderia.ganaderia.interfaces.service;

import java.util.List;
import java.util.Optional;

import org.springframework.lang.NonNull;

import com.ganaderia.ganaderia.entities.User;


public interface IUserService {

    List<User> findAll();
    Optional<User> findByAll(@NonNull Long id);
    User save(User user);
    void deleteById(Long id);
}
