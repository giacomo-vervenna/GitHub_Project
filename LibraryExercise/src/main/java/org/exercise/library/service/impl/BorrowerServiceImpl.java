package org.exercise.library.service.impl;

import org.exercise.library.models.*;
import org.exercise.library.models.Borrower;
import org.exercise.library.repository.GenericRepo;
import org.exercise.library.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerServiceImpl implements BorrowerService {

    private final GenericRepo<Borrower> repo;
    private final GenericRepo<Book> bookrepo;
    private final GenericRepo<Magazine> magazineRepo;
    private final GenericRepo<Borrower> borrowerRepo;

    @Autowired
    public BorrowerServiceImpl(GenericRepo<Borrower> repo, GenericRepo<Book> bookrepo, GenericRepo<Magazine> magazineRepo, GenericRepo<Borrower> borrowerRepo) {
        this.repo = repo;
        this.bookrepo = bookrepo;
        this.magazineRepo = magazineRepo;
        this.borrowerRepo = borrowerRepo;
    }

    @Autowired


    @Override
    public Borrower getBorrower(int id) {
        return this.repo.getById(id);
    }

    @Override
    public List<Borrower> findBorrowers() {
        return this.repo.findAll();
    }

    @Override
    public Borrower addBorrower(Borrower newBorrower) {
        return this.repo.add(newBorrower);
    }

    @Override
    public void deleteBorrower(int id) {
        this.repo.delete(id);
    }

    @Override
    public Borrower updateBorrower(int id, Borrower updated) {
        return this.repo.update(id, updated);
    }

    public boolean canBorrow(Integer t, Integer b) {
        if ((bookrepo.getById(t) != null || magazineRepo.getById(t) != null)  && borrowerRepo.getById(b) != null) {
            return true;
        } else{
            return false;
        }
    }
}
