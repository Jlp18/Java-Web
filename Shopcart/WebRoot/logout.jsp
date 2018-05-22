<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Logout Page</title>

  </head>
  
  <body>
    <%
      session.invalidate();
    %>
    <a href="Online.jsp">再次进入系统</a>
  </body>
</html>
