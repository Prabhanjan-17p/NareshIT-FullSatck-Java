<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Offers</title>
</head>
<body style="text-align:center; font-family:Arial;">
    <h2>Exclusive Bank Offers</h2>
    <ul style="list-style:none;">
        <c:forEach var="offer" items="${offer1}">
            <li>${offer}</li>
        </c:forEach>
        <c:forEach var="offer" items="${offer2}">
            <li>${offer}</li>
        </c:forEach>
        <c:forEach var="offer" items="${offer3}">
            <li>${offer}</li>
        </c:forEach>
    </ul>
    <br>
    <a href="./">Home</a>
</body>
</html>
