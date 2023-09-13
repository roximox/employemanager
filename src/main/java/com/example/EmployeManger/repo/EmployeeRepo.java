package com.example.EmployeManger.repo;

import com.example.EmployeManger.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);
}
