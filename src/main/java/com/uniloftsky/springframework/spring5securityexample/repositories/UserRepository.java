package com.uniloftsky.springframework.spring5securityexample.repositories;

import com.uniloftsky.springframework.spring5securityexample.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
