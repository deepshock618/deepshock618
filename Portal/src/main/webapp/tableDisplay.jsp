<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Table</title>
</head>
<body>

	<%if(session.getAttribute("pass")==null)
	{
		response.sendRedirect("login.jsp");
		
	}
	
		%>
		<h2>Table data for student table</h2>
		<%
			
			String url="jdbc:mysql://localhost:3306/proj";
			String uname="root";
			String pwd="kd1234";
			String q1="select * from student;";
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url,uname,pwd);
			
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(q1);
			
			
			while(rs.next())
			{	
				out.println("id:"+rs.getInt(1)+" name:"+rs.getString(2)+" class:"+rs.getInt(3));
			
			}
			
			
			
			st.close();
		
		%>
		
		<h2>Table data for class table</h2>
		<%
			String q2="select * from class;";
			
			Statement st2= con.createStatement();
			
			ResultSet rs2= st2.executeQuery(q2);
			
			
			while(rs2.next())
			{	
				out.println("no:"+rs2.getInt(1)+" subject:"+rs2.getString(2)+" date:"+rs2.getString(3)+
						" no. of students:"+rs2.getInt(4)+" teacher:"+rs2.getString(5));
			
			}
			
			
			
			
			
			st2.close();
			con.close();
		%>
		
	
	<form action="Logout">
	
	<input type="submit" value="Logout">
	
	</form>
</body>
</html>