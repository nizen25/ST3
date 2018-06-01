<%-- 
    Document   : find_student
    Created on : 31 May 2018, 2:47:02 PM
    Author     : sydney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>FIND A STUDENT</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>        
        <h1>FIND A STUDENT</h1>
        <strong><p style="color: red">${error}</p></strong>
        <form method="GET" action="FindStudentServlet.do">
            <input type="text" name="id" />
            <input type="submit" value="FIND" />
        </form><br>
        <a href="index.html">Home Page</a>
    </body>
</html>