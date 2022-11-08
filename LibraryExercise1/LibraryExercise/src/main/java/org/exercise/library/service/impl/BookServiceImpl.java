package org.exercise.library.service.impl;

import org.exercise.library.models.Book;
import org.exercise.library.repository.GenericRepo;
import org.exercise.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final GenericRepo<Book> repo;

    @Autowired
    public BookServiceImpl(GenericRepo<Book> repository) {
        this.repo = repository;
    }

    @Override
    public Book getBook(int id) {
        return this.repo.getById(id);
    }

    @Override
    public List<Book> findBooks() {
        return this.repo.findAll();
    }

    @Override
    public Book addBook(Book newBook) {
        return this.repo.add(newBook);
    }

    @Override
    public void deleteBook(int id) {
        this.repo.delete(id);
    }

    @Override
    public Book updateBook(int id, Book updated) {
        return this.repo.update(id, updated);
    }
}
