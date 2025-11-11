<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registered</title>
<style>
body {
    font-family: 'Poppins', sans-serif;
    background-color: #f4f6f8;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}
.success-container {
    background: #ffffff;
    padding: 40px 60px;
    border-radius: 15px;
    box-shadow: 0 0 15px rgba(0,0,0,0.1);
    text-align: center;
    width: 600px;
}
h1 {
    color: #2e7d32;
    margin-bottom: 15px;
}
p {
    font-size: 16px;
    color: #333;
}
.btn {
    margin-top: 20px;
    display: inline-block;
    padding: 10px 20px;
    background-color: #e63946;
    color: white;
    text-decoration: none;
    border-radius: 6px;
    transition: background 0.3s;
}
.btn:hover {
    background-color: #d62828;
}
table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 25px;
}
th, td {
    border: 1px solid #ddd;
    padding: 8px;
}
th {
    background-color: #1976d2;
    color: white;
}
</style>
</head>
<body>

<div class="success-container">
    <h1>${resultMSG}</h1>
    <p>Generated Employee ID: <strong>${empId}</strong></p>

    <a href="register" class="btn">➕ Add Another Employee</a>
    <a href="./" class="btn" style="background-color:#1976d2;">🏠 Home</a>

    <c:if test="${not empty empList}">
        <h3 style="margin-top:30px; color:#444;">Employee List</h3>
        <table>
            <thead>
                <tr>
                    <th>Emp ID</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Designation</th>
                    <th>Salary</th>
                    <th>GrossSalary</th>
                	<th>NetSalary</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="e" items="${empList}">
                    <tr>
                        <td>${e.empno}</td>
                        <td>${e.ename}</td>
                        <td>${e.eaddrs}</td>
                        <td>${e.desg}</td>
                        <td>${e.salary}</td>
                        <td>${e.grossSal}</td>
						<td>${e.netSal}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
</div>

</body>
</html>
