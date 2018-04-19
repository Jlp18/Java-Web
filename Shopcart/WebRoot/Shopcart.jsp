<%@ page language="java" import="java.util.*,java.sql.*,com.jsp.main.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>购物车</title>
  </head>
  
  <body>
    <%
      request.setCharacterEncoding("utf-8"); //设置编码格式
      //Books books = new Books("11223","SQL Server基础",25.5f,2);  //创建图书对象
        Books book1 = new Books("11224","大学外语",25.5f,2);
      //Books book2 = new Books("11225","高等数学",23.5f,10);
      //Books book3 = new Books("11226","数据结构",12.0f,15);
      ArrayList arrayList = null; //声明一个ArrayList对象
      if((ArrayList)session.getAttribute("cart")==null) //如果session中从未写入过，则将建立商品对象添加到ArrayList对象中，并写入session
      {
        arrayList = new ArrayList();
        arrayList.add(book1);
        session.setAttribute("cart", arrayList);
        response.sendRedirect("orderindex.jsp");
      }
      else  //如果写入过，则将书本对象添加到arrayList对象中，并写入session
      {
        arrayList = (ArrayList)session.getAttribute("cart");
        if(arrayList.isEmpty())  //如果ArrayList对象为空
        {
          arrayList.add(book1);
          session.setAttribute("cart", arrayList);
          response.sendRedirect("orderindex.jsp");
        }
        else //如果ArrayList对象不为空，则判断购入书本是否已经存在购物车中
        {
          Iterator it = arrayList.iterator();
          for(int i = 0 ; i < arrayList.size() ; i++)
          {
            Books book = (Books)it.next();
            if(book.compareTo(book1)==0) //如果商品已经存在，则打印输出提示错误信息
            {
              out.print("<script>alert('您已添加过该图书');window.close();</script>");
            }
            else  //如果商品不存在，则直接将该商品添加到ArrayList对象中，并写入session
            {
              arrayList.add(book1);
              session.setAttribute("cart", arrayList);
              response.sendRedirect("orderindex.jsp");
            }
          }
        }
      }
    %>
  </body>
</html>
