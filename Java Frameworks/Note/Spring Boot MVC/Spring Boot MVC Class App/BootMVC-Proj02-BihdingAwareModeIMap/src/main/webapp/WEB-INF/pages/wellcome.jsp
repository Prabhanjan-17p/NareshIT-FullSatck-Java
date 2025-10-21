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
        background: linear-gradient(135deg, #89f7fe, #66a6ff);
        color: #333;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
        margin: 0;
    }

    h1 {
        margin-bottom: 20px;
        font-size: 2em;
        color: #222;
    }

    a {
        text-decoration: none;
        background-color: #007bff;
        color: white;
        padding: 10px 20px;
        border-radius: 6px;
        font-weight: bold;
        transition: background 0.3s ease;
    }

    a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <h1>Welcome to Season Finder</h1>
    <a href="season">Find Season</a>
</body>
</html>
