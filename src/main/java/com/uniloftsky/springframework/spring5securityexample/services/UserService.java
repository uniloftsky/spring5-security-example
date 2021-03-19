package com.uniloftsky.springframework.spring5securityexample.services;

import com.uniloftsky.springframework.spring5securityexample.model.User;

import java.util.Set;

public interface UserService extends GenericService<User, Long> {

    @Override
    Set<User> findAll();

    @Override
    User findById(Long aLong);

    @Override
    User save(User obj);

    @Override
    void delete(User obj);
}
