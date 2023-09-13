package com.example.EmployeManger.service;

import com.example.EmployeManger.model.Employee;
import com.example.EmployeManger.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeService {
    private final EmployeeRepo employeeRepo;

@Autowired
    public EmployeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
    employee.setEmployeeCode(UUID.randomUUID().toString());
    return employeeRepo.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }
    public Employee updateEmployee(Employee employee){
    return employeeRepo.save(employee);
    }
  public  void deleteEmployee(Long id){
    employeeRepo.deleteEmployeeById(id);
  }

public Employee findEmployeeById(Long id) {
    return employeeRepo.findEmployeeById(id);
}

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }
}

