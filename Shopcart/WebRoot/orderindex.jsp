<%@ page language="java" import="java.util.*,com.jsp.main.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>数据计算</title>
  </head>
  <body>
    <p>购物车信息：</p>
    <table width="200" border="1">
      <tr>
        <td>名称</td>
        <td>数量</td>
        <td>价格</td>
        <td>小计</td>
      </tr>
      <%
        ArrayList cart = (ArrayList)session.getAttribute("cart");
        if(cart == null || cart.size() == 0)
        {
          out.print("<p>购物车当前为空</p>");
        }
        else
        {
          Books books;
          int quantity;
          double price , subtotal;
          double total = 0;
          Iterator it = cart.iterator();
          for(int i = 0 ; i < cart.size(); i++)
          {
            Books shop = (Books)it.next();
            quantity = shop.getNumber();
            price = shop.getPrice();
            subtotal = quantity * price;
            total += subtotal;
      %>
        <tr>
          <td><%=shop.getName()%></td>
          <td><%=quantity%></td>
          <td><%=price%></td>
          <td><%=subtotal%></td>
        </tr>
      <%
          }
        }
      %>
    </table>
  </body>
</html>
