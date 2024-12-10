package com.example.kiemtrajsp_servlet.service;

import com.example.kiemtrajsp_servlet.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    Employee getEmployeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee(int id,Employee employee);
    void deleteEmployee(int id);

}
