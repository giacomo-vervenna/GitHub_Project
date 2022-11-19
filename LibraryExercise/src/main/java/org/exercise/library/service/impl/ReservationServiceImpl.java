package org.exercise.library.service.impl;

import org.exercise.library.models.Borrower;
import org.exercise.library.models.Magazine;
import org.exercise.library.models.Reservation;
import org.exercise.library.models.Title;
import org.exercise.library.repository.*;
import org.exercise.library.service.BorrowerService;
import org.exercise.library.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    private final GenericRepo<Reservation> repo;

    @Autowired
    public ReservationServiceImpl(GenericRepo<Reservation> repository) {
        this.repo = repository;
    }

    @Override
    public Reservation getReservation(int id) {
        return this.repo.getById(id);
    }

    @Override
    public List<Reservation> findReservations() {
        return this.repo.findAll();
    }

    @Override
    public Reservation addReservation(Integer borrowerId, Integer titleId) {
        if (canBorrow(borrowerId,titleId)) {
            Book book = bookRepo.getById(titleId);
            Borrower borrower = borrowerRepo.getById(borrowerId);
            Reservation reservation = new Reservation();
            reservation.setBorrower(borrower);
            reservation.setTitle(book);
            reservation.setCreationDate(LocalDate.now());
    @Override
    public void deleteReservation(int id) {
        this.repo.delete(id);
    }

    @Override
    public Reservation updateReservation(int id, Reservation updated) {
        return this.repo.update(id, updated);
    }


}
