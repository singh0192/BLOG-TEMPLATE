<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="UTF-8">
  <title>Singh Shopping Login</title>
  
  
  
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>
  <body>
<div class="container">
	<section id="content">
		<form action="/login" method="post">
			<h1>Login Form</h1>
			<div class="button">
			<b>${errorMsg}</b>
		</div>
		<br>
			<div>
				<input type="text" placeholder="Username" required="" id="username" name="userName" />
			</div>
			<div>
				<input type="password" placeholder="Password" required="" id="password"  name="password"/>
			</div>
			<div>
				<input type="submit" value="Log in" />
				<a href="/resetPassword">Lost your password?</a>
				<a href="/registerUser">Register</a>
			</div>
		</form>
		<!-- form -->
		<!-- <div class="button">
			<a href="#">Download source file</a>
		</div>button
 -->	</section><!-- content -->
</div><!-- container -->
</body>
  
    <script src="js/index.js"></script>

</body>
</html>