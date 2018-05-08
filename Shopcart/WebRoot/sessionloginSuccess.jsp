<%@ page language="java" import="java.util.*,java.text.DateFormat" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'sessionloginSuccess.jsp' starting page</title>
  </head>
  
  <body>
    <div id = "one">
      <div id = "two">
        <table width = "800" height = "125" border = "0">
          <tr align="left">
            <td width = "180">恭喜您登录成功! </td>
            <td>当前用户:<%=session.getAttribute("name") %></td>
          </tr>
          <tr align="left">
            <td>当前会话状态:</td>
            <td><%=session.getAttribute("n") %></td>
          </tr>
          <tr align="left">
            <td>创建时间:</td>
            <td><%=session.getAttribute("create") %></td>
          </tr>
          <tr align="left">
            <td>上次访问时间:</td>
            <td><%=session.getAttribute("lastDate") %></td>
          </tr>
          <tr align="left">
            <td>最大不活动间隔:</td>
            <td><%=session.getAttribute("max") %></td>
          </tr>
        </table>
        <a href="<%=response.encodeURL("sessionlogin.jsp")%>">重新登录</a>
        <a href="<%=response.encodeURL("loginout")%>">注销</a>
      </div>
    </div>
  </body>
</html>
