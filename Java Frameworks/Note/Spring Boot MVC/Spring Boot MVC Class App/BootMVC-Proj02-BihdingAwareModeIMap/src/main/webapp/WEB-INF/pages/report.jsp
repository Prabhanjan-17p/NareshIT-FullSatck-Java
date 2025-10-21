<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page import="java.util.*, com.nt.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Report Generator</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #89f7fe, #66a6ff);
        color: #333;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: flex-start;
        padding: 30px;
        margin: 0;
    }

    h1 {
        margin-bottom: 20px;
        font-size: 2em;
        color: #222;
    }

    h3 {
        margin-top: 30px;
        margin-bottom: 10px;
        color: #111;
    }

    table {
        border-collapse: collapse;
        margin-top: 10px;
    }

    table, th, td {
        border: 1px solid #333;
    }

    th, td {
        padding: 8px 15px;
        text-align: left;
    }

    a {
        text-decoration: none;
        background-color: #007bff;
        color: white;
        padding: 10px 20px;
        border-radius: 6px;
        font-weight: bold;
        margin-top: 30px;
        transition: background 0.3s ease;
    }

    a:hover {
        background-color: #0056b3;
    }

    b {
        display: block;
        margin-top: 20px;
    }
</style>
</head>
<body>

    <h1>Report Generator!</h1>

    <!-- Simple Values -->
    <b>Model attributes data (Simple): ${name}, ${age}</b>

    <!-- Collections -->
    <h3>Friends List:</h3>
    <%
        List<String> friends = (List<String>) request.getAttribute("friendsList");
        if (friends != null) {
            for (String f : friends) {
                out.println(f + "<br>");
            }
        } else {
            out.println("No friends data available.<br>");
        }
    %>

    <h3>Courses Array:</h3>
    <%
        String[] courses = (String[]) request.getAttribute("coursesArray");
        if (courses != null) {
            for (String c : courses) {
                out.println(c + "<br>");
            }
        } else {
            out.println("No courses data available.<br>");
        }
    %>

    <!-- Single Model Object -->
    <b>Student Info:</b>
    <br> ID: ${stud.id}
    <br> Name: ${stud.name}
    <br> Course: ${stud.course}

    <!-- Collection of Model Objects -->
    <h3>Students List:</h3>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Course</th>
        </tr>
        <%
            List<Student> list = (List<Student>) request.getAttribute("studentsList");
            if (list != null && !list.isEmpty()) {
                for (Student st : list) {
        %>
                    <tr>
                        <td><%= st.getId() %></td>
                        <td><%= st.getName() %></td>
                        <td><%= st.getCourse() %></td>
                    </tr>
        <%
                }
            } else {
        %>
                <tr>
                    <td colspan="3">No student data available</td>
                </tr>
        <%
            }
        %>
    </table>

    <a href="./">Back to Home</a>

</body>
</html>
