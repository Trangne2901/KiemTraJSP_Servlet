<!DOCTYPE html>
<html>
<head>
    <title>Add New Employee</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h1>Add New Employee</h1>

<form action="employee?action=addEmployee" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name">
    <br><br>
    <label for="age">Age:</label>
    <input type="number" id="age" name="age" >
    <br><br>
    <label for="position">Position:</label>
    <input type="text" id="position" name="position">
    <br><br>
    <label for="department">Department:</label>
    <input type="text" id="department" name="department" >
    <br><br>
    <label for="salary">Salary:</label>
    <input type="number" id="salary" name="salary" >
    <br><br>
    <input type="submit" value="Add Employee">
</form>
<a href="employee">Back to Employee List</a>

<a href="employee">Back to Employee List</a>
</body>
</html>
