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
		// TODO �Զ����ɵķ������

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO �Զ����ɵķ������
		User user = new User();  //����һ��User����
		arg0.setAttribute("user",user);  //��user�����������õ�request������
		//��request�����л�ȡ������
		String username = arg0.getParameter("username");  //��request�����л�ȡusername����
		String password = arg0.getParameter("password");  //��request�����л�ȡpassword����
		String email = arg0.getParameter("email");  //��request�����л�ȡemail����
		String truename = arg0.getParameter("truename");  //��request�����л�ȡtruename����
		String address = arg0.getParameter("address");   //��request�����л�ȡaddress����
		String postcode = arg0.getParameter("postcode");  //��request�����л�ȡpostcode����
		String telephone = arg0.getParameter("telephone");  //��request�����л�ȡtelephone����
		//Ϊuser��������Ը�ֵ
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setTruename(truename);
		user.setAddress(address);
		user.setPostcode(postcode);
		user.setTelephone(telephone);
		
		RequestDispatcher dispatcher = arg0.getRequestDispatcher("success.jsp");  //���óɹ�ת��ҳ��
		RequestDispatcher disp = arg0.getRequestDispatcher("error.jsp");  //����ʧ�� ת��ҳ��
		
		Pattern pname = Pattern.compile("^[A-Za-z]+$");  //��������ʽ�����Pattern
		Matcher mname = pname.matcher(username);
		
		Pattern ptelephone = Pattern.compile("^[0-9]*[1-9][0-9]*$");
		Matcher mtelephone = ptelephone.matcher(telephone);
		if(username==""||password==null||truename==""||address==""||telephone==""||!mname.matches()||!mtelephone.matches())  //�ж��û��������Ϣ�Ƿ�Ϸ�
		{
			disp.forward(arg0, arg1);
			return;
		}
		dispatcher.forward(arg0, arg1);
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO �Զ����ɵķ������

	}

}
