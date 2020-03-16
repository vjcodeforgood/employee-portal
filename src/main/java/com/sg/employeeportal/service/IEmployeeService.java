package com.sg.employeeportal.service;

import com.sg.employeeportal.model.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee save(Employee employee);
    List<Employee> findAll();
}
