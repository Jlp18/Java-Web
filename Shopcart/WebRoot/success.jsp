<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'success.jsp' starting page</title>
  </head>
  
  <body>
    <jsp:useBean id="user" class="com.jsp.main.User" scope="request"></jsp:useBean>
    <table border="0"  cellspacing="0" cellpadding="0" width="458" height="392">
      <tr>
        <td height="28" colspan="2" >
          <font color="red">验证通过,您提交的信息是:</font>
        </td>
      </tr>
      <tr>
        <td width="18%" height="30" align="center">用户名:</td>
        <td width="82%"><%=user.getUsername() %></td>
      </tr>
      <tr>
        <td height="28" align="center">密&nbsp;&nbsp;&nbsp;&nbsp;码:</td>
        <td><%=user.getPassword() %></td>
      </tr>
      <tr>
        <td height="28" align="center">E-mail:</td>
        <td><%=user.getEmail() %></td>
      </tr>
      <tr>
        <td height="28" colspan="2"><hr align="center" size="1" /></td>
      </tr>
      <tr>
        <td height="28" align="center">姓&nbsp;&nbsp;&nbsp;&nbsp;名:</td>
        <td><%=user.getTruename() %></td>
      </tr>
      <tr>
        <td height="28" align="center">地&nbsp;&nbsp;&nbsp;&nbsp;址:</td>
        <td><%=user.getAddress() %></td>
      </tr>
      <tr>
        <td height="28" align="center">邮&nbsp;&nbsp;&nbsp;&nbsp;编:</td>
        <td><%=user.getPosecode() %></td>
      </tr>
      <tr>
        <td height="28" align="center">联系电话:</td>
        <td><%=user.getTelephone() %></td>
      </tr>
    </table>
   </body>
</html>
