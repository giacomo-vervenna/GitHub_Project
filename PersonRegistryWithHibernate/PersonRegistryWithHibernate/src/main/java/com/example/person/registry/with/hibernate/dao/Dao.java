package com.example.person.registry.with.hibernate.dao;

import java.util.List;

public interface Dao<T> {

    T create(T t);
    T update(T t, String s);
    void delete(String s);
    T get(String s);
    List<T> getAll();
}