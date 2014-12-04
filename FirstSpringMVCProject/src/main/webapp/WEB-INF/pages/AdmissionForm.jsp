<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2014/12/01
  Time: 02:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body >
<h1>${headerMessage}</h1>
<h2> STUDENT ADMISSION FORM FOR ENGINEERING COURSES </h2>

<form action="/submitAdmissionForm.html" method="POST">

    <p>
        Name : <input type="text" name="studentName"/>
    </p>

    <p>
        Hobby : <input type="text" name="studentHobby"/>
    </p>
    <input type="submit" value="submit this form by clicking here "/>





</form>


</body>
</html>
