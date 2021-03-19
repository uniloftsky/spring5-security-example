package com.uniloftsky.springframework.spring5securityexample.services;

import com.uniloftsky.springframework.spring5securityexample.model.Role;

import java.util.Set;

public interface RoleService extends GenericService<Role, Long> {

    @Override
    Set<Role> findAll();

    @Override
    Role findById(Long aLong);

    @Override
    Role save(Role obj);

    @Override
    void delete(Role obj);
}
