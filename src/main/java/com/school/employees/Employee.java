package com.school.employees;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    private String title;


    private String firstName;

    private String lastName;

    private String otherNames;


    private String NIN;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate dob;


    @Email(message ="Invalid email address")
    private String email;


    private String phoneNumber;

    private String password;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus employeeStatus;

    private String designation;

}
