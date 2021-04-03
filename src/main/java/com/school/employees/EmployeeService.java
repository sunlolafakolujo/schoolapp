package com.school.employees;

import java.util.List;

public interface EmployeeService {

    Employee newEmployee(NewEmployee employee);
    Employee modifyEmployee(UpdateEmployee employee);
    void suspendEmployee(Long id);


    List<Employee> getAllEmployees();

    Employee getEmployee(Long id);
}
