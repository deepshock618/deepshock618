package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;

@WebServlet("/Edit")
public class Edit extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		if (session.getAttribute("pass") == null) {
			response.sendRedirect("login.jsp");

		}

		 int no = Integer.parseInt(request.getParameter("no"));
		 String sub=request.getParameter("sub"); 
		 String date=request.getParameter("date"); 
		 String stud=request.getParameter("stud");
		 String teach=request.getParameter("teach");
		
		PrintWriter out = response.getWriter();

		
		  String url="jdbc:mysql://localhost:3306/proj"; String uname="root"; 
		  String pwd="kd1234"; 
		  String q="insert into class values(?,?,?,?,?);";
		  
		  try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  
		  try {
				
			
			  
			  Connection con1 = DriverManager.getConnection(url,uname,pwd);
			  PreparedStatement stt= con1.prepareStatement(q); 
				  
			  stt.setInt(1, no);
			  stt.setString(2, sub);
			  stt.setString(3, date);
			  stt.setString(4, stud);
			  stt.setString(5, teach);
			  int count= stt.executeUpdate();
			  
			  
			 out.println(count+" row was added");
			  
			  
			  
			 stt.close(); 
			 con1.close();
		  } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

	}

}
