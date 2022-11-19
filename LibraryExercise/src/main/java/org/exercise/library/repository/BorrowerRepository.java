package org.exercise.library.repository;

import org.exercise.library.models.Borrower;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BorrowerRepository implements GenericRepo<Borrower> {

    private final List<Borrower> borrowerMockedDb;

    private Integer sequence;

    public BorrowerRepository() {
        this.sequence = 0;
        this.borrowerMockedDb = new ArrayList<>();

        this.add(new Borrower("Alfredo", "Esposito"));
        this.add(new Borrower("Gennaro", "Rossi"));
        this.add(new Borrower("Giulio", "Bettarini"));
    }

    @Override
    public Borrower getById(int id) {
        return this.borrowerMockedDb.stream()
                .filter(b -> id == b.getId())
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Borrower> findAll() {
        return this.borrowerMockedDb;
    }

    @Override
    public Borrower add(Borrower entity) {
        Integer newId = this.sequence++;
        Borrower newBorrower = new Borrower(newId, entity.getName(), entity.getSurname());
        this.borrowerMockedDb.add(newBorrower);

        return newBorrower;
    }

    @Override
    public void delete(int id) {
        this.borrowerMockedDb.stream()
                .filter(b -> id == b.getId())
                .findFirst()
                .ifPresent(x -> this.borrowerMockedDb.remove(x));
    }

    @Override
    public Borrower update(int id, Borrower updated) {
        Borrower found = getById(id);

        if (found != null) {
            int idx = this.borrowerMockedDb.indexOf(found);
            Borrower newBorrower = new Borrower(found.getId(), updated.getName(), updated.getSurname());
            this.borrowerMockedDb.set(idx, newBorrower);

            return newBorrower;
        } else
            throw new IllegalStateException("No Borrower with " + id + " id found");
    }
}
