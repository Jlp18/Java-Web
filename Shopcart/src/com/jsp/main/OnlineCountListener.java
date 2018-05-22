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
	//����һ��ServletContext����
	private ServletContext application = null;
	//context��ʼ��ʱ����
	public void contextInitialized(ServletContextEvent sce){
		//������ʼ��ʱ����application�д��һ���յ�����
		this.application = sce.getServletContext();
		this.application.setAttribute("alluser", new ArrayList());
	}
	//contextɾ��ʱ����
	public void contextDestroyed(ServletContextEvent sce){
		
	}
	
	public void sessionCreated(HttpSessionEvent se){
		
	}
	
	public void sessionDestroyed(HttpSessionEvent se){
		//���û����ƴ��б���ɾ��
		List l = (List)this.application.getAttribute("alluser");
		String value = (String)se.getSession().getAttribute("uname");
		l.remove(value);
		this.application.setAttribute("alluser",l);
	}
	
	public void attributeAdded(HttpSessionBindingEvent se){
		//�����¼�ɹ������û����Ʊ������б�֮��
		List l = (List)this.application.getAttribute("alluser");
		l.add(se.getValue());
		this.application.setAttribute("alluser", l);
	}
	
	//ɾ��һ���µ�����ʱ����
	public void attributeRemoved(HttpSessionBindingEvent se){
		
	}
	//���Ա����ʱ����
	public void attributeReplaced(HttpSessionBindingEvent se){
		
	}
}
