package org.exercise.library.service;

import org.exercise.library.models.Borrower;
import org.exercise.library.models.Title;

import java.util.List;

public interface BorrowerService {
    Borrower getBorrower(int id);

    List<Borrower> findBorrowers();

    Borrower addBorrower(Borrower newBorrower);

    void deleteBorrower(int id);

    Borrower updateBorrower(int id, Borrower updated);

    boolean canBorrow(Integer t, Integer b);
}
