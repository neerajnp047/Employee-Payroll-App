package com.example.EmployeePayroll.dto;
import lombok.Data;
import lombok.NoArgsConstructor;

// UC-01 of DTO Introducing DTO and Model to Employee Payroll App
@Data
@NoArgsConstructor
public class EmployeeDTO {
    private String name;
    private double salary;
}
