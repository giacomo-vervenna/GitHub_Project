package org.exercise.library.repository;

import org.exercise.library.models.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository implements GenericRepo<Book>{
    private final List<Book> bookMockedDb;
    private Integer sequence;

    public BookRepository() {
        this.sequence = 0;
        this.bookMockedDb = new ArrayList<>();

        this.add(new Book("Lord of the Ring: The Fellowship of the Ring"));
        this.add(new Book("Lord of the Ring: The TWo Towers"));
        this.add(new Book("Lord of the Ring: The Return of the King"));
        this.add(new Book("The Hobbit: An Unexpected Journey"));
        this.add(new Book("The Hobbit: The Desolation of Smaug"));
        this.add(new Book("The Hobbit: The Battle of the Five Armies"));
        this.add(new Book("The Silmarillion"));
    }

    @Override
    public Book getById(int id) {
        return this.bookMockedDb.stream()
                .filter(b -> id == b.getId())
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Book> findAll() {
        return this.bookMockedDb;
    }

    @Override
    public Book add(Book entity) {
        Integer newId = this.sequence++;
        Book newBook = new Book(newId, entity.getName());
        this.bookMockedDb.add(newBook);

        return newBook;
    }

    @Override
    public void delete(int id) {
        this.bookMockedDb.stream()
                .filter(b -> id == b.getId())
                .findFirst()
                .ifPresent(x -> this.bookMockedDb.remove(x));
    }

    @Override
    public Book update(int id, Book updated) {
        Book found = getById(id);

        if (found != null) {
            int idx = this.bookMockedDb.indexOf(found);
            Book newBook = new Book(found.getId(), updated.getName());
            this.bookMockedDb.set(idx, newBook);

            return newBook;
        } else
            throw new IllegalStateException("No Book with " + id + " id found");
    }
}
