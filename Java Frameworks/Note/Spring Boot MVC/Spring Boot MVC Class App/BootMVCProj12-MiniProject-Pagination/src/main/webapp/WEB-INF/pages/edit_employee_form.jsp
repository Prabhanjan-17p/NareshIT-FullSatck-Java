<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee Details</title>
<style>
    body {
        font-family: 'Poppins', sans-serif;
        background-color: #f4f6f8;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .edit-container {
        background-color: #fff;
        padding: 30px 40px;
        border-radius: 16px;
        box-shadow: 0 4px 20px rgba(0,0,0,0.1);
        width: 400px;
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }

    label {
        display: block;
        margin-top: 10px;
        color: #555;
        font-weight: 500;
    }

    input[type="text"],
    input[type="number"] {
        width: 100%;
        padding: 10px;
        border-radius: 8px;
        border: 1px solid #ccc;
        margin-top: 5px;
        font-size: 14px;
    }

    input[readonly] {
        background-color: #eee;
        cursor: not-allowed;
    }

    .btn-container {
        text-align: center;
        margin-top: 20px;
    }

    .btn {
        background-color: #007bff;
        color: white;
        border: none;
        padding: 10px 20px;
        border-radius: 8px;
        cursor: pointer;
        font-size: 15px;
        transition: background 0.3s;
    }

    .btn:hover {
        background-color: #0056b3;
    }

    .back-link {
        display: block;
        text-align: center;
        margin-top: 15px;
        color: #007bff;
        text-decoration: none;
        font-size: 14px;
    }

    .back-link:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
    <div class="edit-container">
        <h2>Edit Employee</h2>

        <form:form method="post" modelAttribute="emp" action="edit">
            <label>Employee No</label>
            <form:input path="empno" readonly="true"/>

            <label>Employee Name</label>
            <form:input path="ename"/>

            <label>Employee Address</label>
            <form:input path="eaddrs"/>

            <label>Designation</label>
            <form:input path="desg"/>

            <label>Salary</label>
            <form:input path="salary" type="number" step="0.01"/>

            <div class="btn-container">
                <input type="submit" class="btn" value="Update Employee"/>
            </div>
        </form:form>

        <a href="list" class="back-link">← Back to Employee List</a>
    </div>
</body>
</html>
