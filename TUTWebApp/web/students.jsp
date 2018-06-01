<%-- 
    Document   : students
    Created on : 19 May 2018, 3:18:06 AM
    Author     : sydney
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Students</title>
    </head>
    <body>
        <h1>All students</h1>
        
        <%
            String zeroStudents = (String) request.getAttribute("zeroStudents");
            if (zeroStudents != null) {
        %>
        <strong><p style="color: green"><%=zeroStudents%></p></strong>
        <ol>
            <li><a href="add_student.html">Add a student</a></li>
            <li><a href="index.html">Home Page</a></li>
        </ol>
        <%
             } else {
        %>
        <table border="1">
            <tr>
                <th>Name</th>
                <th>Surname</th>
                <th>Street</th>
                <th>Area</th>
                <th>Code</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${students}" var="student">
                <tr>
                    <td><c:out value="${student.name}" /></td>
                    <td><c:out value="${student.surname}" /></td>
                    <td><c:out value="${student.address.street}" /></td>
                    <td><c:out value="${student.address.location}" /></td>
                    <td><c:out value="${student.address.code}" /></td>
                    <td>
                        <a href="DeleteStudentServlet.do?id=${student.id}">Delete</a> |
                        <a href="FindStudentServlet.do?id=${student.id}">Update</a>
                    </td>
                </tr>
            </c:forEach>
        </table><br>
        <a href="index.html">Home Page</a>
        <%
            }
        %>
    </body>
</html>
