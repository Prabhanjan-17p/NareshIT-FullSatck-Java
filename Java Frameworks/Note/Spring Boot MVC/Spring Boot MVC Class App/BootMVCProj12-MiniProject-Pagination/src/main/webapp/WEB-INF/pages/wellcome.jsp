<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #6a11cb, #2575fc);
            color: white;
            text-align: center;
            padding-top: 100px;
        }
        h1 {
            font-size: 3em;
            margin-bottom: 50px;
        }
        a {
            display: inline-block;
            padding: 15px 30px;
            background-color: #ff9800;
            color: white;
            text-decoration: none;
            font-size: 1.2em;
            border-radius: 8px;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #e68900;
        }
    </style>
</head>
<body>

    <h1>Welcome to Our Application!</h1>
    <a href="report">Go to Report</a>
	<a href="page_report">Go to Pagable Report</a>
</body>
</html>
