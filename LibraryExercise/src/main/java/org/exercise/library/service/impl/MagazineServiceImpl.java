package org.exercise.library.service.impl;

import org.exercise.library.models.Magazine;
import org.exercise.library.repository.GenericRepo;
import org.exercise.library.service.MagazineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagazineServiceImpl implements MagazineService {
    private final GenericRepo<Magazine> repo;

    @Autowired
    public MagazineServiceImpl(GenericRepo<Magazine> repository) {
        this.repo = repository;
    }

    @Override
    public Magazine getMagazine(int id) {
        return this.repo.getById(id);
    }

    @Override
    public List<Magazine> findMagazines() {
        return this.repo.findAll();
    }

    @Override
    public Magazine addMagazine(Magazine newMagazine) {
        return this.repo.add(newMagazine);
    }

    @Override
    public void deleteMagazine(int id) {
        this.repo.delete(id);
    }

    @Override
    public Magazine updateMagazine(int id, Magazine updated) {
        return this.repo.update(id, updated);
    }
}
