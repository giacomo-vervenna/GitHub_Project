package org.exercise.library.models;

public class Book extends Title {

    public Book(Integer id, String name) {
        super(id, name, 30);
    }
    public Book(String name) {
        super(name, 30);
    }
}
