package org.exercise.library.service;

import org.exercise.library.models.Book;

import java.util.List;

public interface BookService {
    Book getBook(int id);
    List<Book> findAllBooks();
    Book addBook(Book newBook);
    void deleteBook(int id);
    Book updateBook(int id, Book updated);
}
