package com.workforces.service;

import com.workforces.entities.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    List<Employee> findAll();
    Employee findById(Long id);
    Employee save(Employee employee);
}
