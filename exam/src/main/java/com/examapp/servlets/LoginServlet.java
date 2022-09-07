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


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		UserDao ud=new UserDao(com.examapp.helper.ConnectionProvider.getConnection());
		Users user=ud.getUserByEmailPass(email, password);
		if(user!=null) {
			response.sendRedirect("index.jsp");
		}
		else {
			out.println("user not found");
		}
	}

}
