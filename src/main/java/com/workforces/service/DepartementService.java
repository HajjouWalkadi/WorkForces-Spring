package com.workforces.service;

import com.workforces.entities.Departement;
import com.workforces.repository.DepartementRepository;

public class DepartementService implements DepartementServiceInterface{
    private final DepartementRepository departementRepository;

    public DepartementService(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    @Override
    public Departement findById(Long id) {
        return departementRepository.findById(id).orElse(null);
    }

    @Override
    public Departement save(Departement departement) {
        return departementRepository.save(departement);
    }

    public static void main(String[] args) {

    }
}
