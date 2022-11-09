package org.exercise.library.repository;

import org.exercise.library.models.Borrower;
import org.exercise.library.models.Reservation;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReservationRepository implements GenericRepo<Reservation> {

    private final List<Reservation> reservationMockedDb;
    private Integer sequence;


    public ReservationRepository() {
        this.sequence = 0;
        this.reservationMockedDb = new ArrayList<>();
    }

    @Override
    public Reservation getById(int id) {
        return this.reservationMockedDb.stream()
                .filter(b -> id == b.getId())
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Reservation> findAll() {
        return this.reservationMockedDb;
    }

    @Override
    public Reservation add(Reservation entity) {
        Integer newId = this.sequence++;
        Reservation newReservation = new Reservation(newId, entity.getBorrower(), entity.getTitle(), entity.getDate());
        this.reservationMockedDb.add(newReservation);

        return newReservation;
    }

    @Override
    public void delete(int id) {
        this.reservationMockedDb.stream()
                .filter(m -> id == m.getId())
                .findFirst()
                .ifPresent(x -> this.reservationMockedDb.remove(x)
                );
    }

    @Override
    public Reservation update(int id, Reservation updated) {
        Reservation found = getById(id);

        if (found != null) {
            int idx = this.reservationMockedDb.indexOf(found);
            Reservation newReservation = new Reservation(found.getId(), updated.getDate());
            this.reservationMockedDb.set(idx, newReservation);

            return newReservation;
        } else
            throw new IllegalStateException("No Reservation with " + id + " id found");
    }
}
