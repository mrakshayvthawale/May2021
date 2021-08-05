<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	<h2>Index Page</h2>
	<h3><a href="FirstServlet">Send Request to Server</a></h3>
	
	<% 
		String records = request.getParameter("recordInserted");
		if(records!=null)
			out.print("<h3>"+records+"</h3>");
	
	%>
	
	

</body>
</html>