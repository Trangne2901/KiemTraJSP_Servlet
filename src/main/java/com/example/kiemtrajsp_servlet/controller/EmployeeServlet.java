package com.example.kiemtrajsp_servlet.controller;

import com.example.kiemtrajsp_servlet.model.Employee;
import com.example.kiemtrajsp_servlet.service.EmployeeService;
import com.example.kiemtrajsp_servlet.service.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";

        }
        switch (action) {
            case "add":
                showNewForm(request, response);
                break;
            default:
                showEmployee(request, response);
                break;

        }
    } @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "addEmployee":
                addEmployee(request, response);
                break;
            default:
                showEmployee(request, response);
                break;

        }
    }

    private void showEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> listEmployee = employeeService.getAllEmployee();
        request.setAttribute("listEmployee", listEmployee);
        request.getRequestDispatcher("employee-list.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("employee-form.jsp").forward(request, response);
    }

    private void addEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String position = request.getParameter("position");
        String department = request.getParameter("department");
        double salary = Double.parseDouble(request.getParameter("salary"));
        int id = (int) (Math.random() * 10000);

        Employee newEmployee = new Employee(id, name, age, position, department, salary);
        employeeService.addEmployee(newEmployee);
        response.sendRedirect("employee");
    }

}
