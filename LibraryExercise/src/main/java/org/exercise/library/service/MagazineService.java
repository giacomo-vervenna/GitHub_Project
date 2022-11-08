package org.exercise.library.service;

import org.exercise.library.models.Magazine;

import java.util.List;

public interface MagazineService {
    Magazine getMagazine(int id);
    List<Magazine> findMagazines();
    Magazine addMagazine(Magazine newMagazine);
    void deleteMagazine(int id);
    Magazine updateMagazine(int id, Magazine updated);
}
