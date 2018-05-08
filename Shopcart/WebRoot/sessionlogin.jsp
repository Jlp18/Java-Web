<%@ page language="java" import="java.util.*,java.text.DateFormat" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'sessionlogin.jsp' starting page</title>
  </head>
  
  <body>
    <div id = "one">
      <div id = "two">
        <table width = "800" height = "125" border = "0">
          <tr align="left">
            <td width = "180">当前会话状态: </td>
            <%
              DateFormat f = DateFormat.getTimeInstance();
            %>
            <td><%
              if(session.isNew()){
                out.print("新的会话");
              }
              else{
                out.print("旧的会话");
              }
            %></td>
          </tr>
          <tr align="left">
            <td>会话ID:</td>
            <td><%=session.getId()%></td>
          </tr>
          <tr align="left">
            <td>创建时间:</td>
            <td><%=f.format(session.getCreationTime()) %></td>
          </tr>
          <tr align="left">
            <td>上次访问时间:</td>
            <td><%=f.format(session.getLastAccessedTime()) %></td>
          </tr>
          <tr align="left">
            <td>最大不活动间隔:</td>
            <td><%=session.getMaxInactiveInterval() %></td>
          </tr>
        </table><br />
        
        <form id="form1" name="form1" method="post" action="sessionlogin">
                                        用户名:<input type="text" name="userName" />
                                        密&nbsp;&nbsp;&nbsp;码:<input type="text" name="password" />
           <input type="submit" value="提交" style="width:60px" />
           <input type="reset" value="重置" style="width:60px" />
        </form>
      </div>
    </div>
  </body>
</html>
