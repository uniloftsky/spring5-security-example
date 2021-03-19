package com.uniloftsky.springframework.spring5securityexample.services;

import com.uniloftsky.springframework.spring5securityexample.model.User;
import com.uniloftsky.springframework.spring5securityexample.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> findAll() {
        Set<User> users = new HashSet<>();
        userRepository.findAll().iterator().forEachRemaining(users::add);
        return users;
    }

    @Override
    public User findById(Long aLong) {
        Optional<User> userOptional = userRepository.findById(aLong);
        if (userOptional.isEmpty()) {
            throw new RuntimeException("Expected user not found!");
        }
        return userOptional.get();
    }

    @Override
    public User save(User obj) {
        return userRepository.save(obj);
    }

    @Override
    public void delete(User obj) {
        userRepository.delete(obj);
    }
}
