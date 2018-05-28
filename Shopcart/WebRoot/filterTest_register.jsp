<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'filterTest_register.jsp' starting page</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form name="myform" method="post" action="userfilter">
      <table border="0" cellspacing="-2" cellpadding="-2" width="458" height="392">
        <tr>
          <td height="28" colspan="2">
            <font color="red">填写注册信息(带*号的是必须填写的)</font>
          </td>
        </tr>
        <tr>
          <td width="18" height="30" aligin="center">用户名:</td>
          <td width="82%" class="word_grey">
            <input name="username" type="text" maxlength="20" id="checkname" />*
          </td>
        </tr>
        <tr>
          <td height="28" align="center">密&nbsp;&nbsp;&nbsp;&nbsp;码</td>
          <td height="28">
            <input name="password" type="password" size="20" maxlength="20" id="mypassword" />*
          </td>
        </tr>
        <tr>
          <td height="28" align="center">E-mail:</td>
          <td height="28">
            <input name="email" type="text" size="50" id="email" />
          </td>
        </tr>
        <tr>
          <td height="28" colspan="2"><hr align="center" size="1" /></td>
        </tr>
        <tr>
          <td height="28" align="center">姓&nbsp;&nbsp;&nbsp;&nbsp;名:</td>
          <td>
            <input name="truename" type="text" maxlength="10" id="truename" />*
          </td>
        </tr>
        <tr>
          <td height="28" align="center">地&nbsp;&nbsp;&nbsp;&nbsp;址:</td>
          <td>
            <input name="address" type="text" size="50" id="address" />*
          </td>
        </tr>
        <tr>
          <td height="28" align="center">邮&nbsp;&nbsp;&nbsp;&nbsp;编:</td>
          <td>
            <input name="postcode" type="text" size="20" id="postcode" />
          </td>
        </tr>
        <tr>
          <td height="28" align="center">联系电话:</td>
          <td>
            <input name="telephone" type="text" id="telephone" />*
          </td>
        </tr>
        <tr>
          <td height="34">&nbsp;</td>
          <td>
            <input type="submit" class="btn_grey" value="确定保存" />
            <input type="reset" class="btn_gery" value="重新填写" />
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>
