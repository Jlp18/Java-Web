package com.jsp.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class sessionlogin extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public sessionlogin() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("userName");
		String password = request.getParameter("password");
		boolean n;
		String id;
		Date create;
		Date lastDate;
		long max;
		if(name == null || password == null || name.equals("") || password.equals(""))
		{
			response.sendRedirect(response.encodeRedirectURL("sessionlogin.jsp"));
		}
		else
		{
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			n = session.isNew();
			id = session.getId();
			create = new Date(session.getCreationTime());
			lastDate = new Date(session.getLastAccessedTime());
			max = session.getMaxInactiveInterval();
			session.setAttribute("n", n);
			session.setAttribute("id", id);
			session.setAttribute("create", create);
			session.setAttribute("lastDate",lastDate);
			session.setAttribute("max", max);
			response.sendRedirect(response.encodeRedirectURL("sessionloginSuccess.jsp"));
		}
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
