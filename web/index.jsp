<%@ page import="net.pharoz.testJavaTomcat.FirstOne" %><%--
  Created by IntelliJ IDEA.
  User: sestienney
  Date: 25/01/18
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    FirstOne tc = new FirstOne();
    System.out.print(tc.hw());
  %>
  </body>
</html>
