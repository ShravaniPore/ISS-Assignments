<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet type="text/css" href="style.css">
</head>
<body>
<div class="container">
<h1>Login</h1>
<form action="LoginServlet" method="post">
<label for="username">Username:</label>
<input type="text" id="username" name="username" required><br>
<label for="password">Password:</label>
<input type="password" id="password" name="password" required><br>
<button type="submit">Login</button>
</form>
<p><a href="index.html">Back to home</a><p>

<% String error=request.getParameter("error");
if(error!=null && error.equals("1")){%>
	<p style="color:red;">Invalid username or password. Please try again.
<%}%>

<%String rs=request.getParameter("registration");
			if(rs!=null&&rs.equals("success")){
				%> <p style="color: green;">Registration Successful. Please login again.</p> <%
			}
			%>

</div>
</body>
</html>