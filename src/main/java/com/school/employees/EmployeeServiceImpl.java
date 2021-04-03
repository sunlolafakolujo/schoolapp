package com.school.employees;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    private ModelMapper mapper =new ModelMapper();

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public Employee newEmployee(NewEmployee dat) {

        Employee employee= mapper.map(dat,Employee.class);
        employee.setEmployeeStatus(EmployeeStatus.ACTIVE);


        return employeeRepository.save(employee);
    }

    @Override
    public Employee modifyEmployee(UpdateEmployee data) {
        Employee employee=employeeRepository.findById(data.getId()).orElseThrow();
        mapper.map(data,employee);

        return employeeRepository.save(employee);
    }

    @Override
    public void suspendEmployee(Long id) {

        Employee employee= employeeRepository.findById(id).orElseThrow();

        employee.setEmployeeStatus(EmployeeStatus.SUSPENDED);

        employeeRepository.save(employee);

    }

    @Override
    public List<Employee> getAllEmployees() {


        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {

        return employeeRepository.findById(id).orElseThrow();
    }
}
