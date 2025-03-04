package com.example.EmployeePayroll.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "employees")
@Data // Lombok generates getters, setters, toString, equals, and hashcode
@NoArgsConstructor // Lombok generates a no-args constructor
@AllArgsConstructor // Lombok generates an all-args constructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 @NotBlank(message = "Name is required")
    private String name;

 @Min(value = 1000, message = "Salary must be at least 1000")
    private double salary;

}

