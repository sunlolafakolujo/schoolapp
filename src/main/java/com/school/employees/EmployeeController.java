package com.school.employees;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getEmployee(){

        return employeeService.getAllEmployees();

    }

    @PostMapping
    public Employee newEmployee(@Valid @RequestBody NewEmployee  employee ){

        return employeeService.newEmployee(employee);
    }

    @PutMapping
    public Employee updateEmployee( @Valid @RequestBody UpdateEmployee updateEmployee ){

        return employeeService.modifyEmployee(updateEmployee);
    }

    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable Long id){

        return employeeService.getEmployee(id);
    }

    @PostMapping("{id}/suspend")
    public void suspendEmployee(@PathVariable Long id){
        employeeService.suspendEmployee(id);
    }


}
