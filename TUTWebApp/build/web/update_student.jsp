<%-- 
    Document   : update_student
    Created on : 31 May 2018, 3:17:39 PM
    Author     : sydney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Update Student Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Update Student Details</h1>
        <p style="color: green">${found}</p>
        <form action="UpdateStudentServlet.do" method="POST">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id" value="${student.id}" readonly="" /></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" value="${student.name}"/></td>
                </tr>
                <tr>
                    <td>Surname</td>
                    <td><input type="text" name="surname" value="${student.surname}"/></td>
                </tr>
                <tr>
                    <td hidden=""><input type="text" name="addressId" value="${student.address.id}" hidden=""/></td>
                </tr>
                <tr>
                    <td>Street</td>
                    <td><input type="text" name="street" value="${student.address.street}"/></td>
                </tr>
                <tr>
                    <td>Location</td>
                    <td><input type="text" name="location" value="${student.address.location}"/></td>
                </tr>
                <tr>
                    <td>Code</td>
                    <td><input type="text" name="code" value="${student.address.code}"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="UPDATE"/></td>
                </tr>
            </table>
        </form>
        <a href="index.html">Home Page</a>
    </body>
</html>