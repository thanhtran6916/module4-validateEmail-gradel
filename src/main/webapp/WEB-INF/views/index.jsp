<%--
  Created by IntelliJ IDEA.
  User: t
  Date: 10/11/2021
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/validate" method="post">
    <input type="text" name="email">
    <button>Submit</button>
  </form>
  <p>${message}</p>
  </body>
</html>
