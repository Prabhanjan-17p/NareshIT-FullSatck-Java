<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Report</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 20px;
        }

        h1 {
            color: #d32f2f;
            text-align: center;
            margin-bottom: 20px;
        }

        .nav-links {
            width: 90%;
            margin: 0 auto 30px auto;
            text-align: right;
        }

        .nav-links a {
            text-decoration: none;
            color: #ffffff;
            background-color: #1976d2;
            padding: 10px 15px;
            margin-left: 10px;
            border-radius: 5px;
            font-weight: bold;
            transition: background-color 0.3s;
        }

        .nav-links a:hover {
            background-color: #0d47a1;
        }

        table {
            width: 90%;
            margin: 0 auto;
            border-collapse: collapse;
            background-color: #ffffff;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        th, td {
            padding: 12px 15px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #1976d2;
            color: #ffffff;
            text-transform: uppercase;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        a.action-link {
            text-decoration: none;
            color: #1976d2;
            font-weight: bold;
        }

        a.action-link:hover {
            text-decoration: underline;
            color: #0d47a1;
        }

        .no-data {
            text-align: center;
            font-size: 1.2rem;
            color: #555555;
            margin-top: 50px;
        }
    </style>
</head>
<body>

<h1>Employee Report</h1>

<div class="nav-links">
    <a href="./">Home</a>
    <a href="emp_add">Add New Employee</a>
</div>

<c:choose>
    <c:when test="${!empty empsList}">
        <table>
            <tr>
                <th>EmpNo</th>
                <th>EmpName</th>
                <th>EmpAddress</th>
                <th>EmpDesignation</th>
                <th>EmpSalary</th>
                <th>EmpGrossSalary</th>
                <th>EmpNetSalary</th>
                <th>Action</th>
            </tr>
            <c:forEach var="emp" items="${empsList}">
                <tr>
                    <td>${emp.empno}</td>
                    <td>${emp.ename}</td>
                    <td>${emp.eaddrs}</td>
                    <td>${emp.desg}</td>
                    <td>${emp.salary}</td>
                    <td>${emp.grossSal}</td>
                    <td>${emp.netSal}</td>
                    <td>
                        <a class="action-link" href="edit?no=${emp.empno}">Edit</a> |
                        <a class="action-link" href="delete?no=${emp.empno}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <p class="no-data">No report available.</p>
    </c:otherwise>
</c:choose>

</body>
</html>
