<%@ include file="common/header.jspf" %>

	<title>Login Page</title>
	<br>
		<p1>Welcome to the login page ${name }!</p1><br><br>
		<form method="post">
			<p1>Name:</p1> <input type="text" name="name"><br><br>
			<p1>Password:</p1> <input type="password" name="password"><br><br>
			<input type="submit">
		</form>
  <%@ include file="common/footer.jspf" %>