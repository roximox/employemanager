package com.example.EmployeManger;

import com.example.EmployeManger.model.Employee;
import com.example.EmployeManger.service.EmployeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
    private final EmployeService employeService;

    public EmployeeResource(EmployeService employeService) {
        this.employeService = employeService;
    }

@PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeService.addEmployee(employee);
    }
@GetMapping("/all")
public ResponseEntity<List<Employee>> getAllEmployees () {
    List<Employee> employees = employeService.findAllEmployees();
    return new ResponseEntity<>(employees, HttpStatus.OK);}
@PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeService.updateEmployee(employee);
    }
@DeleteMapping("/delete/id/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeService.deleteEmployee(id);
    }
@GetMapping("/find/{id}")
    public Employee findEmployeeById(@PathVariable Long id) {
        return employeService.findEmployeeById(id);
    }
}
