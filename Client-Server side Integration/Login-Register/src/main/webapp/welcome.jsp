<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet type="text/css" href="style.css">

</head>
<body>
<% 
HttpSession session1=request.getSession(false);
// Check if the session is not null and the username attribute is set
if (session1 != null && session1.getAttribute("username") != null) {
    // Get the username from the session
    String username = (String) session1.getAttribute("username");

%>
<div class="container">
<h1>Welcome, <%= username %>!</h1>
<p>We are now inside the web application</p>
<div class="links">
<a href="<%=request.getContextPath()%>/LogoutServlet">Logout from here</a>
</div>
</div>
 <%
        } else {
            // Redirect to the login page if the session is not valid
            response.sendRedirect("login.jsp");
        }
    %>
</body>
</html>