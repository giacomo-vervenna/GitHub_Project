package org.exercise.library.models;

import java.util.Date;

public class Reservation {

    private Integer id;
    private Integer borrowerId;
    private Integer titleId;
    private Date date;

    public Reservation() {
    }

    public Reservation(Integer newId, Integer borrowerId, Integer titleId, Date date) {
        this.id = newId;
        this.borrowerId = borrowerId;
        this.titleId = titleId;
        this.date = date;
    }

    public Reservation(Integer id, Date date) {
        this.id = id;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(long date) {
        date = new Date().getTime();
    }
}
