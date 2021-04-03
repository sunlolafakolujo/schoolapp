package com.school.employees;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
@Data
public class NewEmployee {


    private String title;


    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    private String otherNames;


    private String NIN;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="yyyy-MM-dd")
    private LocalDate dob;

    @Email(message ="Invalid email address")
    private String email;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus employeeStatus;

    private String designation;
}
