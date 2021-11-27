<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<%if(session.getAttribute("pass")==null)
	{
		response.sendRedirect("login.jsp");
		
	}
		
		
		
		%>
	
	
	
	
	
	<h2>Welcome to Learner's Administrative Portal Home Page</h2>
	<br><a href="tableDisplay.jsp">1. View Tables</a></br>
	<a href="editTable.jsp">2. Assign specifics to table Class</a>
	
	<form action="Logout">
	
	<input type="submit" value="Logout">
	
	</form>
</body>
</html>