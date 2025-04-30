package com.ganaderia.ganaderia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ganaderia.ganaderia.entities.User;
import com.ganaderia.ganaderia.interfaces.service.IUserService;
import com.ganaderia.ganaderia.repositories.UserRepository;

@Service
public class UserServiceImpl implements IUserService{

    // @Autowired sino en el constructor
    private UserRepository repository;


    public UserServiceImpl(UserRepository repository) {
        this.repository =repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return (List<User>) this.repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> findByAll(@NonNull Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
