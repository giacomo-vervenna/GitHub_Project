package org.exercise.library.repository;

import org.exercise.library.models.Borrower;

import java.util.List;

public interface GenericRepo<T> {
    T getById(int id);
    List<T> findAll();
    T add(T entity);
    void delete(int id);
    T update(int id, T updated);
}
