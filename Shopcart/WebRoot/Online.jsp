<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Online Page</title>
  </head>
  
  <body>
    <div id="one">
      <div id="two">
        <h3>欢迎登录窗内网</h3>
        <form action="Online.jsp" method="post">
          用户名:<input  type="text" name="name" style="width:110px" />
          <br>
          密码:<input type="text" name="password" style="width:110px" /> <br> <br>
          <input type="submit" name="commit" value="登录" style="color:#666" />
          <a href="logout.jsp">注销</a>
        </form>
      </div>
      <div id="three">
        <!-- 向session接收输入的用户名 -->
        <%
          request.setCharacterEncoding("UTF-8");
          if(request.getParameter("name")!=null)
          {
            session.setAttribute("uname", request.getParameter("name"));
          }
        %>
        <h2>在线人员</h2>
        <%
          List l = (List)application.getAttribute("alluser");
          Iterator iter = l.iterator();
          while(iter.hasNext()){
        %>
        <li><%=iter.next() %></li>
        <%
          }
        %>
        <p>当前在线的用户数:<%=l.size() %></p>
      </div>
    </div>
  </body>
</html>
