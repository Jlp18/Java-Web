package com.jsp.main;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class OnlineCountListener implements ServletContextListener,HttpSessionListener,HttpSessionAttributeListener {
	//声明一个ServletContext对象
	private ServletContext application = null;
	//context初始化时激发
	public void contextInitialized(ServletContextEvent sce){
		//容器初始化时，向application中存放一个空的容器
		this.application = sce.getServletContext();
		this.application.setAttribute("alluser", new ArrayList());
	}
	//context删除时激发
	public void contextDestroyed(ServletContextEvent sce){
		
	}
	
	public void sessionCreated(HttpSessionEvent se){
		
	}
	
	public void sessionDestroyed(HttpSessionEvent se){
		//将用户名称从列表中删除
		List l = (List)this.application.getAttribute("alluser");
		String value = (String)se.getSession().getAttribute("uname");
		l.remove(value);
		this.application.setAttribute("alluser",l);
	}
	
	public void attributeAdded(HttpSessionBindingEvent se){
		//如果登录成功，则将用户名称保存在列表之中
		List l = (List)this.application.getAttribute("alluser");
		l.add(se.getValue());
		this.application.setAttribute("alluser", l);
	}
	
	//删除一个新的属性时激发
	public void attributeRemoved(HttpSessionBindingEvent se){
		
	}
	//属性被替代时激发
	public void attributeReplaced(HttpSessionBindingEvent se){
		
	}
}
