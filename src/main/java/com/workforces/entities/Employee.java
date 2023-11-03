package com.workforces.entities;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double salaire;

    public Employee() {
    }

    public Employee(String name, Double salaire) {
        this.name = name;
        this.salaire = salaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }
    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    @ManyToOne
    private Departement departement;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}

