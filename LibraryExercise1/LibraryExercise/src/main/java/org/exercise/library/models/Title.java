package org.exercise.library.models;

public abstract class Title {
    private Integer id;
    private String name;
    private Integer lendingTime;

    protected Title(Integer id, String name, Integer lendingTime) {
        this.id = id;
        this.name = name;
        this.lendingTime = lendingTime;
    }

    protected Title(String name, Integer lendingTime) {
        this.id = null;
        this.name = name;
        this.lendingTime = lendingTime;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLendingTime() {
        return lendingTime;
    }

    public void setLendingTime(Integer lendingTime) {
        this.lendingTime = lendingTime;
    }
}
