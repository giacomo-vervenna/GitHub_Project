package org.exercise.library.models;

public class Magazine extends Title{

    public Magazine(Integer id, String name) {
        super(id, name, 10);
    }
    public Magazine(String name) {
        super(name, 10);
    }
}
