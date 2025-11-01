<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register Employee</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #f4f6f8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background: #fff;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            width: 400px;
        }
        h2 {
            color: #e63946;
            text-align: center;
            margin-bottom: 25px;
        }
        table {
            width: 100%;
        }
        td {
            padding: 8px 5px;
            font-size: 15px;
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 7px;
            border: 1px solid #ccc;
            border-radius: 6px;
        }
        input[readonly] {
            background-color: #f1f1f1;
            color: #888;
        }
        input[type="submit"] {
            width: 100%;
            background-color: #e63946;
            color: #fff;
            border: none;
            padding: 10px;
            border-radius: 6px;
            font-size: 16px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #d62828;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h2>Register Employee</h2>
    <frm:form modelAttribute="emp" action="registerEmp" method="post">
        <table>
            <tr>
                <td>Employee Name:</td>
                <td><frm:input path="ename" placeholder="Enter employee name" /></td>
            </tr>
            <tr>
                <td>Employee Address:</td>
                <td><frm:input path="eaddrs" placeholder="Enter address" /></td>
            </tr>
            <tr>
                <td>Employee Designation:</td>
                <td><frm:input path="desg" placeholder="Enter designation" /></td>
            </tr>
            <tr>
                <td>Employee Salary:</td>
                <td><frm:input path="salary" placeholder="Enter salary" type="number" /></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align:center;">
                    <input type="submit" value="Register Employee" />
                </td>
            </tr>
        </table>
    </frm:form>
</div>

</body>
</html>
