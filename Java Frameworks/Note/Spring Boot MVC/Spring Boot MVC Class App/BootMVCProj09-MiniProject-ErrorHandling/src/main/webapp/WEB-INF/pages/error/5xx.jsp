<%@ page isELIgnored="false" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Global Error Page</title>
<style>
    body {
        font-family: 'Poppins', sans-serif;
        background: linear-gradient(135deg, #f5f7fa, #c3cfe2);
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .error-container {
        background-color: #ffffff;
        width: 600px;
        border-radius: 16px;
        box-shadow: 0 8px 25px rgba(0, 0, 0, 0.1);
        padding: 40px;
        text-align: center;
        animation: fadeIn 0.8s ease;
    }

    h1 {
        color: #d32f2f;
        font-size: 2rem;
        margin-bottom: 10px;
    }

    h2 {
        color: #1e3a8a;
        font-size: 1.3rem;
        margin-bottom: 25px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin: 0 auto;
        border-radius: 12px;
        overflow: hidden;
        background-color: #f9fafb;
    }

    th, td {
        padding: 12px 15px;
        text-align: left;
        border-bottom: 1px solid #e5e7eb;
        font-size: 0.95rem;
    }

    th {
        width: 35%;
        background-color: #2563eb;
        color: #fff;
        text-transform: uppercase;
        letter-spacing: 0.5px;
    }

    td {
        color: #374151;
        word-break: break-all;
    }

    tr:last-child td {
        border-bottom: none;
    }

    .btn {
        display: inline-block;
        margin-top: 25px;
        padding: 10px 20px;
        color: #fff;
        background-color: #2563eb;
        text-decoration: none;
        border-radius: 8px;
        font-weight: 500;
        transition: background-color 0.3s;
    }

    .btn:hover {
        background-color: #1e40af;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    @media screen and (max-width: 600px) {
        .error-container {
            width: 90%;
            padding: 25px;
        }

        h1 {
            font-size: 1.6rem;
        }

        h2 {
            font-size: 1.1rem;
        }

        table {
            font-size: 0.9rem;
        }
    }
</style>
</head>
<body>

<div class="error-container">
    <h1>5xx Error Page  (5xx.jsp)  (Server Side Errors page) </h1>
    <h2>Error Details</h2>

    <table>
        <tr>
            <th>Status</th>
            <td>${status}</td>
        </tr>
        <tr>
            <th>Path</th>
            <td>${path}</td>
        </tr>
        <tr>
            <th>Message</th>
            <td>${message}</td>
        </tr>
        <tr>
            <th>Exception</th>
            <td>${exception}</td>
        </tr>
        <tr>
            <th>Timestamp</th>
            <td>${timestamp}</td>
        </tr>
        <tr>
            <th>Error</th>
            <td>${error}</td>
        </tr>
    </table>

    <a href="./" class="btn">Go Back Home</a>
</div>

</body>
</html>
