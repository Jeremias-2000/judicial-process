package com.docker.process.service;

import java.util.List;

public interface AbstractService<T>{
    List<T> findAll();
    T findId(String id);
    T update(String id , T process);
    void delete(String id);
}
