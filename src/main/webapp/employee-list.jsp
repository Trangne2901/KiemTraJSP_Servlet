<%--
  Created by IntelliJ IDEA.
  User: tranz_quyzn
  Date: 10/12/2024
  Time: 2:10 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h1>Danh sach nhan vien</h1>
<br>
<a href="employee?action=add">Add Employee</a>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Ten</th>
        <th>tuoi</th>
        <th>Vi tri</th>
        <th>Phong</th>
        <th>Luong</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${listEmployee}">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.age}</td>
            <td>${employee.department}</td>
            <td>${employee.salary}</td>

            <td>
                <a href="employee?action=edit&id=${employee.id}">Edit</a>
                <a href="employee?action=delete&id=${employee.id}" >Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
