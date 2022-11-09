package org.exercise.library.controller;

import org.exercise.library.models.Magazine;
import org.exercise.library.service.MagazineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/magazine")
public class MagazineController {
    private final MagazineService service;

    @Autowired
    public MagazineController(MagazineService magazineService) {
        this.service = magazineService;
    }

    @RequestMapping("/find_magazines")
    public ResponseEntity<List<Magazine>> findAllMagazine() {
        List<Magazine> response = service.findMagazines();
        return ResponseEntity.ok(response);
    }

    @RequestMapping(value = "/add_magazine", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity<Magazine> addMagazine(@RequestBody Magazine newMagazine) {
        Magazine response = service.addMagazine(newMagazine);
        return ResponseEntity.ok(response);
    }

    @RequestMapping(value = "/remove_magazine", method = RequestMethod.DELETE)
    public ResponseEntity<String> removeMagazine(@RequestParam Integer id) {
        service.deleteMagazine(id);
        return ResponseEntity.ok("Magazine deleted");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Magazine> getMagazineById(
            @PathVariable(value = "id", required = true) Integer id
    ) {
        Magazine response = service.getMagazine(id);
        return ResponseEntity.ok(response);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Magazine> updateMagazine(@PathVariable Integer id, @RequestBody Magazine updatedMagazine) {
        Magazine response = service.updateMagazine(id, updatedMagazine);
        return ResponseEntity.ok(response);
    }
}
