package org.exercise.library.service;

import org.exercise.library.models.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation getReservation(int id);

    List<Reservation> findReservations();

    Reservation addReservation(Reservation newReservation);

    void deleteReservation(int id);

    Reservation updateReservation(int id, Reservation updated);
}
