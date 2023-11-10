package com.workforces.repository;

import com.workforces.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement,Long> {
}
