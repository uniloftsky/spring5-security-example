package com.uniloftsky.springframework.spring5securityexample.repositories;

import com.uniloftsky.springframework.spring5securityexample.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
