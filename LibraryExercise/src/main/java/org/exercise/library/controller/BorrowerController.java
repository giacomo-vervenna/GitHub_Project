package org.exercise.library.controller;

import org.exercise.library.models.Borrower;
import org.exercise.library.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrower")
public class BorrowerController {
    
    private final BorrowerService service;

    @Autowired
    public BorrowerController(BorrowerService BorrowerService) {
        this.service = BorrowerService;
    }

    @RequestMapping("/find_borrowers")
    public ResponseEntity<List<Borrower>> findAllBorrowers() {
        List<Borrower> response = service.findBorrowers();
        return ResponseEntity.ok(response);
    }

    @RequestMapping(value = "/add_borrower", method = RequestMethod.POST)
    public ResponseEntity<Borrower> addBorrower(@RequestBody Borrower newBorrower) {
        Borrower response = service.addBorrower(newBorrower);
        return ResponseEntity.ok(response);
    }

    @RequestMapping(value = "/remove_borrower", method = RequestMethod.DELETE)
    public ResponseEntity<String> removeBorrower(@RequestParam Integer id) {
        service.deleteBorrower(id);
        return ResponseEntity.ok("Borrower deleted");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Borrower> getBorrowerById(
            @PathVariable(value = "id", required = true) Integer id
    ) {
        Borrower response = service.getBorrower(id);
        return ResponseEntity.ok(response);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Borrower> updateMagazine(@PathVariable Integer id, @RequestBody Borrower updatedBorrower) {
        Borrower response = service.updateBorrower(id, updatedBorrower);
        return ResponseEntity.ok(response);
    }
}
