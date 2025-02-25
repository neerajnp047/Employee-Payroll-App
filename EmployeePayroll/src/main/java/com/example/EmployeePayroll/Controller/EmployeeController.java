package com.example.EmployeePayroll.Controller;

import com.example.EmployeePayroll.model.Employee;
import com.example.EmployeePayroll.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // UC-1 Setup Employee Payroll App with REST and MySQL
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

}

