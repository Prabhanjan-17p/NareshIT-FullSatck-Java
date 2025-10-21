<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Season Result</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #ffecd2, #fcb69f);
        color: #333;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
        margin: 0;
    }

    h1 {
        color: #222;
    }

    a {
        text-decoration: none;
        background-color: #28a745;
        color: white;
        padding: 10px 20px;
        border-radius: 6px;
        font-weight: bold;
        margin-top: 20px;
        transition: background 0.3s ease;
    }

    a:hover {
        background-color: #1e7e34;
    }
</style>
</head>
<body>

    <h1>Current Season: ${resMsg} </h1>

    <a href="./">Back to Home</a>

</body>
</html>
