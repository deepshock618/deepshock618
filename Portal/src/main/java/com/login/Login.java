package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet 
{
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String pass1="password";
		String pass=request.getParameter("pass");
		if(pass.equals(pass1))
			{
				
				HttpSession session=request.getSession();
				session.setAttribute("pass",pass);
				response.sendRedirect("welcome.jsp");
			
			}
		else
			response.sendRedirect("login.jsp");
		
		
		
		
	}


}
