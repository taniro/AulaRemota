<%--
  Created by IntelliJ IDEA.
  User: tanir
  Date: 15/06/2020
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <%
    for(int i = 0; i < 10; i++) {
      response.getWriter().println("Hello");
    }
  %>
  </body>
</html>
