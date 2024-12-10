package com.example.kiemtrajsp_servlet.service;

import com.example.kiemtrajsp_servlet.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

    private static Map<Integer, Employee> employees;

    static {
        employees = new HashMap<>();
        employees.put(1, new Employee(1, "HuyenTrang", 19, "Leader", "IT", 65000));
        employees.put(2, new Employee(2, "TamNguyen", 19, "Employee", "IT", 50000));
        employees.put(3, new Employee(3, "ChiAnh", 1, "Employee", "IT", 55000));
        employees.put(4, new Employee(4, "NgocThom", 23, "management", "IT", 100000));
        employees.put(5, new Employee(5, "KhanhNg", 19, "Employee", "IT", 56000));
    }

    @Override
    public List<Employee> getAllEmployee() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employees.get(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        employees.put(employee.getId(), employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employees.remove(id);
    }
}
