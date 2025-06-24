<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet type="text/css" href="style.css">
<script>
function validateForm() {
    const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value;

    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (!emailRegex.test(email)) {
        alert("Please enter a valid email address.");
        return false;
    }

    if (password.length < 6) {
        alert("Password must be at least 6 characters long.");
        return false;
    }

    return true;
}
</script>
</head>
<body>
<div class="container">
<h1>Register</h1>
<form action="RegisterServlet" method="post" onsubmit="return validateForm()">
<label for="username">Username:</label>
<input type="text" id="username" name="username" required><br>
<label for="username">Email:</label>
<input type="text" id="email" name="email" required><br>
<label for="password">Password:</label>
<input type="password" id="password" name="password" required><br>
<button type="submit">Register</button>
</form>
<p><a href="index.html">Back to home</a><p>
</div>
</body>
</html>