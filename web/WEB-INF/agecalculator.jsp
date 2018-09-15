<%-- 
    Document   : agecalculator
    Created on : Sep 13, 2018, 1:04:15 PM
    Author     : 672762
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post">
            Enter Age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday"><br>
            
        </form>
        
        <div>
            ${message}
        </div>
        <br><br>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
