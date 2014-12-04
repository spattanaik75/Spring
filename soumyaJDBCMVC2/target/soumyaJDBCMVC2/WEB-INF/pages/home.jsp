<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2014/12/04
  Time: 09:36 AM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title></title>
</head>
<body>
<div align="center">
    <h1>Contact List</h1>
    <h3><a href="/newContact">New Contact</a> </h3>
    <table>
        <th>No</th>
        <th>Id</th>
        <th>Name</th>
        <th>Age</th>

        <c:forEach var="std" items="${students}" varStatus="status">
            <tr>

                <td>${std.id}</td>
                <td>${std.name}</td>
                <td>${std.age}</td>
                <td><a href="/editContact?id=${std.id}">Edit</a></td>
                <td><a href="/deleteContact?id=${std.id}">Delete</a></td>

            </tr>
        </c:forEach>

    </table>

</div>
</body>
</html>
