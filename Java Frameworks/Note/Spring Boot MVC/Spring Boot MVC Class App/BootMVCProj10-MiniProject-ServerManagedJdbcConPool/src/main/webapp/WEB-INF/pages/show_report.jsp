<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Report</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <style>
        /* --- Global Styles --- */
        body {
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(120deg, #f5f7fa, #c3cfe2);
            margin: 0;
            padding: 0;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        h1 {
            color: #1e3a8a;
            text-align: center;
            margin-top: 40px;
            margin-bottom: 20px;
            font-size: 2rem;
            letter-spacing: 1px;
        }

        /* --- Navigation Buttons --- */
        .nav-links {
            width: 95%;
            display: flex;
            justify-content: flex-end;
            margin-bottom: 30px;
        }

        .nav-links a {
            text-decoration: none;
            color: #ffffff;
            background: #2563eb;
            padding: 10px 20px;
            margin-left: 10px;
            border-radius: 8px;
            font-weight: 500;
            transition: all 0.3s;
            box-shadow: 0 3px 8px rgba(0, 0, 0, 0.2);
        }

        .nav-links a:hover {
            background: #1e40af;
            transform: translateY(-2px);
        }

        /* --- Table Styling --- */
        .table-container {
            width: 95%;
            max-width: 1200px;
            background-color: #fff;
            border-radius: 12px;
            overflow: hidden;
            box-shadow: 0 6px 25px rgba(0, 0, 0, 0.1);
        }

        table {
            width: 100%;
            border-collapse: collapse;
            text-align: center;
        }

        th, td {
            padding: 14px 12px;
            border-bottom: 1px solid #e5e7eb;
            font-size: 0.95rem;
        }

        th {
            background-color: #2563eb;
            color: #fff;
            text-transform: uppercase;
            letter-spacing: 0.5px;
        }

        tr:hover {
            background-color: #f9fafb;
        }

        /* --- Action Links --- */
        a.action-link {
            text-decoration: none;
            color: #2563eb;
            font-weight: 600;
            transition: 0.3s;
        }

        a.action-link:hover {
            color: #1e40af;
            text-decoration: underline;
        }

        /* --- No Data Message --- */
        .no-data {
            text-align: center;
            font-size: 1.2rem;
            color: #374151;
            margin-top: 50px;
        }

        /* --- Responsive Table --- */
        @media screen and (max-width: 768px) {
            .table-container {
                width: 100%;
                margin: 0 10px;
                overflow-x: auto;
            }

            th, td {
                padding: 10px;
                font-size: 0.9rem;
            }

            h1 {
                font-size: 1.6rem;
            }

            .nav-links {
                flex-direction: column;
                align-items: flex-end;
                gap: 10px;
                margin-right: 10px;
            }
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
        <div class="table-container">
            <table>
                <thead>
                    <tr>
                        <th>Emp No</th>
                        <th>Name</th>
                        <th>Address</th>
                        <th>Designation</th>
                        <th>Salary</th>
                        <th>Gross Salary</th>
                        <th>Net Salary</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
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
                                <a class="action-link" href="delete?no=${emp.empno}" onclick="return confirm('Do you want to delete this employee?')">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </c:when>

    <c:otherwise>
        <p class="no-data">No employee records available.</p>
    </c:otherwise>
</c:choose>

</body>
</html>
