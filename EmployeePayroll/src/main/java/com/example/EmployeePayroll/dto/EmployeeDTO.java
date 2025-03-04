package com.example.EmployeePayroll.dto;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// UC-01 Use Lombok Library to auto generate getters and setters for the DTO
@Getter
@Setter

// UC-01 of DTO Introducing DTO and Model to Employee Payroll App

@Data
@NoArgsConstructor
public class EmployeeDTO {
    private String name;
    private double salary;
}
