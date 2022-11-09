package org.exercise.library.controller;

import org.exercise.library.models.Borrower;
import org.exercise.library.models.Reservation;
import org.exercise.library.models.Title;
import org.exercise.library.service.BorrowerService;
import org.exercise.library.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService service;
    private final BorrowerService borrowerService;

    @Autowired
    public ReservationController(ReservationService service, BorrowerService borrowerService){
        this.borrowerService = borrowerService;
        this.service = service;
    }

/**
 * mai introdurre logica nelle API, fixare.
 */
    @RequestMapping(value = "/create_reservation", method = RequestMethod.POST)
    public ResponseEntity<Reservation> createReservation(@RequestParam(value = "b") Integer b,
                                                         @RequestParam(value = "t")Integer t,
                                                         @RequestBody Reservation newReservation) {
        if (borrowerService.canBorrow(t, b) == true) {
            Reservation response = service.addReservation(newReservation);
            return ResponseEntity.ok(response);
        } else {
            throw new IllegalStateException("Cant create a reservation");
        }
    }
}
