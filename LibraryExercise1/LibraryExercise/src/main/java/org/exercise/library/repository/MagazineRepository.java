package org.exercise.library.repository;

import org.exercise.library.models.Book;
import org.exercise.library.models.Magazine;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MagazineRepository implements GenericRepo<Magazine> {
    private final List<Magazine> magazineMockedDb;
    private Integer sequence;

    public MagazineRepository() {
        this.sequence = 0;
        this.magazineMockedDb = new ArrayList<>();

        this.add(new Magazine("Superman"));
        this.add(new Magazine("The Amazing Spiderman"));
        this.add(new Magazine("Batman"));
        this.add(new Magazine("Berserk"));
        this.add(new Magazine("One Piece"));
        this.add(new Magazine("Deadpool"));
        this.add(new Magazine("Wolverine"));
    }

    @Override
    public Magazine getById(int id) {
        return this.magazineMockedDb.stream()
                .filter(b -> id == b.getId())
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Magazine> findAll() {
        return this.magazineMockedDb;
    }

    @Override
    public Magazine add(Magazine entity) {
        Integer newId = this.sequence++;
        Magazine newMagazine = new Magazine(newId, entity.getName());
        this.magazineMockedDb.add(newMagazine);

        return newMagazine;
    }

    @Override
    public void delete(int id) {
        this.magazineMockedDb.stream()
                .filter(m -> id == m.getId())
                .findFirst()
                .ifPresent(x -> this.magazineMockedDb.remove(x)
                );
    }

    @Override
    public Magazine update(int id, Magazine updated) {
        Magazine found = getById(id);

        if (found != null) {
            int idx = this.magazineMockedDb.indexOf(found);
            Magazine newMagazine = new Magazine(found.getId(), updated.getName());
            this.magazineMockedDb.set(idx, newMagazine);

            return newMagazine;
        } else
            throw new IllegalStateException("No Magazine with " + id + " id found");
    }
}

