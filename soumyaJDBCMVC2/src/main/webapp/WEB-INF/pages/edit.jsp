<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2014/12/03
  Time: 10:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/update?id=${id}" method="POST">
    <table>

        <tr>
            <%--<td>Id :</td>--%>
            <%--<td><input type="text" name="id" value=${id}></td>--%>

            <td>Age :</td>
            <td><input type="text" name="age"></td>
        </tr>

    </table>
    <p><input type="submit" value="update"></p>
</form>

</body>
</html>
