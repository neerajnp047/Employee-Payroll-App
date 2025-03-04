package com.example.EmployeePayroll.service;

import com.example.EmployeePayroll.dto.EmployeeDTO;
import com.example.EmployeePayroll.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    //UC-03 Ability for the Services Layer to store the Employee Payroll Data

    private final List<Employee> employeeList = new ArrayList<>();
    private long idCounter = 1; // To simulate auto-incremented IDs

    public Employee createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setId(idCounter++); // Assigning a unique ID manually
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        employeeList.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeList); // Returning a copy to prevent external modification
    }

    public Employee getEmployeeById(Long id) {
        return employeeList.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
    }

    public Employee updateEmployee(Long id, EmployeeDTO updatedEmployeeDTO) {
        Employee employee = getEmployeeById(id);
        employee.setName(updatedEmployeeDTO.getName());
        employee.setSalary(updatedEmployeeDTO.getSalary());
        return employee;
    }

    public String deleteEmployee(Long id) {
        Optional<Employee> employeeToDelete = employeeList.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst();

        employeeToDelete.ifPresent(employeeList::remove);

        return employeeToDelete.isPresent() ? "Employee deleted with ID: " + id : "Employee not found!";
    }
}
