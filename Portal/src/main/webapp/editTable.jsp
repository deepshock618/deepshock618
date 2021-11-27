<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Table</title>
</head>
<body>
	
	<%if(session.getAttribute("pass")==null)
	{
		response.sendRedirect("login.jsp");
		
	}
		
		
		
		%>
	
	
	<h3>Enter:</h3> 
	
	
	<form action="Edit" method="post">
	
	<div>no<input type="number" name="no"</div> 
	<div>Subject<input type="text" name="sub"</div> 
	<div>Date<input type="text" name="date"</div> 
	<div>No. of Students<input type="number" name="stud"</div>
	<div>Teacher Name<input type="text" name="teach"</div>
	
	<input type="submit">
	</form>
	
	
	
	
	
	
	
	<form action="Logout">
	
	<input type="submit" value="Logout">
	
	</form>
</body>
</html>