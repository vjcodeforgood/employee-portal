package com.sg.employeeportal.repository;

import com.sg.employeeportal.model.Employee;
import org.springframework.data.repository.Repository;


import java.util.List;
public interface EmployeeRepository extends Repository<Employee,Long> {
    List<Employee> findAll();
    Employee save(Employee persisted);
}
