package com.workforces.service;

import com.workforces.entities.Departement;

public interface DepartementServiceInterface {
    Departement findById(Long id);
    Departement save(Departement departement);
}
