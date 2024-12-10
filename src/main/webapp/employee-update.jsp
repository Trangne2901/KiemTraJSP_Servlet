<%--
  Created by IntelliJ IDEA.
  User: tranz_quyzn
  Date: 10/12/2024
  Time: 3:52 CH
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<html>
<head>
    <title>Add New Employee</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h1>Update Employee</h1>

<form action="/employee?action=update&&id=${employee.id}" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${employee.name}">
    <br><br>
    <label for="age">Age:</label>
    <input type="number" id="age" name="age" value="${employee.age}" >
    <br><br>
    <label for="position">Position:</label>
    <input type="text" id="position" name="position" value="${employee.position}">
    <br><br>
    <label for="department">Department:</label>
    <input type="text" id="department" name="department" value="${employee.department}" >
    <br><br>
    <label for="salary">Salary:</label>
    <input type="number" id="salary" name="salary" value="${employee.salary}" >
    <br><br>
    <input type="submit" value="Update Employee">
</form>
<a href="employee">Back to Employee List</a>
</body>
</html>
