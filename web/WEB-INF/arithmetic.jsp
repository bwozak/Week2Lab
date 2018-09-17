<%-- 
    Document   : arithmetic
    Created on : Sep 13, 2018, 1:30:13 PM
    Author     : 672762
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First:  <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" value="+" name="add"> 
            <input type="submit" value="-" name="subtract">
            <input type="submit" value="*" name="multiply">
            <input type="submit" value="%" name="divide">
        </form>
        
        <div>
            ${message}
        </div>
    </body>
</html>
