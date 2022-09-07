package com.examapp.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.examapp.dao.UserDao;
import com.examapp.entities.Users;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("txtname");
		String email=request.getParameter("txtemail");
		String password=request.getParameter("txtpassword");
		out.println(name);
		Users u=new Users(name,email,password);
		UserDao udao=new UserDao(com.examapp.helper.ConnectionProvider.getConnection());
		udao.saveUser(u);
		
		
	}

}
