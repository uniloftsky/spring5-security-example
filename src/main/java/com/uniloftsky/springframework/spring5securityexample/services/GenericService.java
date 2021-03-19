package com.uniloftsky.springframework.spring5securityexample.services;

import java.util.Set;

public interface GenericService<T, ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T obj);
    void delete(T obj);

}
