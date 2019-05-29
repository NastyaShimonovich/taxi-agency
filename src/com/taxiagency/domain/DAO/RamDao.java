package com.taxiagency.domain.DAO;

import com.taxiagency.domain.Entity;

import java.util.*;

public class RamDao<T extends Entity> implements Dao<T> {
    private Map<String, T> ram;

    public RamDao(){
        this.ram = new HashMap<>();
    }

    @Override
    public String save(T obj) {
        ram.put(obj.getId(), obj);
        return null;
    }

    @Override
    public void update(T obj) {
        ram.put(obj.getId(), obj);
    }

    @Override
    public String upsert(T obj) {
        return null;
    }

    @Override
    public void delete(String str) {

    }

    @Override
    public T findByid(String str) {
        return null;
    }

   /* @Override
    public void delete(String str) {
        ram.remove(str.getId());
    } */

   // @Override
    public T findById(String str) {
        return ram.get(str);
    }
    @Override
    public List<T> findAll(){
        List<T> objects = new ArrayList<>();
        Set<String> keys = ram.keySet();

        for(String key : keys){
            T obj = ram.get(key);
            objects.add(obj);
        }
        return objects;
    }
}
