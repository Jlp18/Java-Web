package com.jsp.main;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class userfilter implements Filter {

	@Override
	public void destroy() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO 自动生成的方法存根
		User user = new User();  //创建一个User对象
		arg0.setAttribute("user",user);  //将user对象引用设置到request对象中
		//从request对象中获取表单参数
		String username = arg0.getParameter("username");  //从request对象中获取username参数
		String password = arg0.getParameter("password");  //从request对象中获取password参数
		String email = arg0.getParameter("email");  //从request对象中获取email参数
		String truename = arg0.getParameter("truename");  //从request对象中获取truename参数
		String address = arg0.getParameter("address");   //从request对象中获取address参数
		String postcode = arg0.getParameter("postcode");  //从request对象中获取postcode参数
		String telephone = arg0.getParameter("telephone");  //从request对象中获取telephone参数
		//为user对象的属性赋值
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setTruename(truename);
		user.setAddress(address);
		user.setPostcode(postcode);
		user.setTelephone(telephone);
		
		RequestDispatcher dispatcher = arg0.getRequestDispatcher("success.jsp");  //设置成功转发页面
		RequestDispatcher disp = arg0.getRequestDispatcher("error.jsp");  //设置失败 转发页面
		
		Pattern pname = Pattern.compile("^[A-Za-z]+$");  //把正则表达式编译成Pattern
		Matcher mname = pname.matcher(username);
		
		Pattern ptelephone = Pattern.compile("^[0-9]*[1-9][0-9]*$");
		Matcher mtelephone = ptelephone.matcher(telephone);
		if(username==""||password==null||truename==""||address==""||telephone==""||!mname.matches()||!mtelephone.matches())  //判断用户输入的信息是否合法
		{
			disp.forward(arg0, arg1);
			return;
		}
		dispatcher.forward(arg0, arg1);
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO 自动生成的方法存根

	}

}
