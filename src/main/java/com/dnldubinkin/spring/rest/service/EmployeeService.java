package com.dnldubinkin.spring.rest.service;


import com.dnldubinkin.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployee(int id);

    public void saveUpdateEmployee(Employee employee);
    public void deleteEmployee(int id);

}
