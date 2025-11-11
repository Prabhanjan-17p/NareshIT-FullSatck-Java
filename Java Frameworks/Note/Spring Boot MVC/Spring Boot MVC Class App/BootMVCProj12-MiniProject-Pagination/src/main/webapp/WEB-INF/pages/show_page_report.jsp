<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Report - Pagination</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7fafc;
        }
        h1, h2 {
            text-align: center;
        }
        table {
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #e0f7fa;
            width: 90%;
        }
        th, td {
            border: 1px solid #333;
            padding: 8px 12px;
            text-align: center;
        }
        th {
            background-color: #0097a7;
            color: white;
        }
        a {
            text-decoration: none;
            color: #00695c;
            font-weight: bold;
        }
        a:hover {
            text-decoration: underline;
        }
        .pagination {
            text-align: center;
            margin-top: 20px;
        }
        .pagination a {
            margin: 0 8px;
            padding: 5px 10px;
            border: 1px solid #0097a7;
            border-radius: 5px;
            color: #0097a7;
        }
        .pagination a:hover {
            background-color: #0097a7;
            color: white;
        }
        .action-img {
            width: 25px;
            height: 20px;
            vertical-align: middle;
        }
        .btn-container {
            text-align: center;
            margin: 30px 0;
        }
        .btn-container img {
            vertical-align: middle;
        }
    </style>
</head>
<body>

    <h1 style="color:red;">Report Page By Pagination</h1>

    <c:choose>
        <c:when test="${!empty pageData}">
            <h2 style="color:green;">
                Employees Information — Page ${pageData.number + 1} of ${pageData.totalPages}
            </h2>

            <table>
                <tr>
                    <th>Emp No</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Designation</th>
                    <th>Salary</th>
                    <th>Gross Salary</th>
                    <th>Net Salary</th>
                    <th>Operations</th>
                </tr>

                <c:forEach var="emp" items="${pageData.content}">
                    <tr>
                        <td>${emp.empno}</td>
                        <td>${emp.ename}</td>
                        <td>${emp.eaddrs}</td>
                        <td>${emp.desg}</td>
                        <td>${emp.salary}</td>
                        <td>${emp.grossSal}</td> 
                        <td>${emp.netSal}</td>  
                        <td>
                            <a href="edit?no=${emp.empno}">Edit</a>
                            &nbsp;&nbsp;
                            <a href="delete?no=${emp.empno}" onclick="return confirm('Do you want to delete this record?');">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>

            <div class="pagination">
                <c:if test="${!pageData.first}">
                    <a href="page_report?page=0">First</a>
                </c:if>

                <c:if test="${pageData.hasPrevious()}">
                    <a href="page_report?page=${pageData.number - 1}">Previous</a>
                </c:if>

                <c:forEach var="i" begin="1" end="${pageData.totalPages}" step="1">
                    <c:choose>
                        <c:when test="${pageData.number + 1 == i}">
                            <strong>[${i}]</strong>
                        </c:when>
                        <c:otherwise>
                            <a href="page_report?page=${i - 1}">[${i}]</a>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>

                <c:if test="${pageData.hasNext()}">
                    <a href="page_report?page=${pageData.number + 1}">Next</a>
                </c:if>

                <c:if test="${!pageData.last}">
                    <a href="page_report?page=${pageData.totalPages - 1}">Last</a>
                </c:if>
            </div>
        </c:when>

        <c:otherwise>
            <h2 style="color:red;">No Employee Records Found</h2>
        </c:otherwise>
    </c:choose>

    <h2 style="color:red;">${resultMsg}</h2>

    <div class="btn-container">
        <a href="add">
            &nbsp; Add Employee
        </a>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <a href="./">
            &nbsp; Home
        </a>
    </div>

</body>
</html>
