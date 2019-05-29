package com.taxiagency.domain.DAO;

import com.taxiagency.domain.Entity;

import java.util.List;

public interface Dao<T extends Entity>{
    String save(T obj);
    void update(T obj);
    String upsert(T obj);
    void delete(String str);
    T findByid(String str);
    List<T> findAll();
}
