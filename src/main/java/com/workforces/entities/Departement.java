package com.workforces.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Departement(String name) {
        this.name = name;
    }

    public Departement() {
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

    public List<Employee> getEmployee() {
        return employees;
    }
    public void setEmployee(List<Employee> employees) {
        this.employees = employees;
    }
    @OneToMany(mappedBy = "departement")
    private List<Employee> employees;


    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
