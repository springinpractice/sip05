<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${not empty param.direct}">
	<c:remove scope="session" var="SPRING_SECURITY_SAVED_REQUEST_KEY" />
</c:if>
<html>
	<head>
		<title>Login</title>
		<script type="text/javascript">
			window.onload = function() {
				document.getElementById("username").focus();
			}
		</script>
	</head>
<body>
	<h2>Login</h2>
	<c:if test="${not empty sessionScope['SPRING_SECURITY_SAVED_REQUEST_KEY']}">
		<p>Please log in to access the page you requested.</p>
	</c:if>
	<c:if test="${not empty param.error}">
		<div class="error-message">${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}</div>
	</c:if>
	<form method="post" action="j_spring_security_check">
		<table border="1" frame="border">
			<tr>
				<td>
					<div align="center"><h3>Returning Users</h3></div>
					Email*<br/>		
					<input id="username" type="text" name="j_username" value="<c:out value='${param.username}'/>"/><br/>
					Password*<br/>		
					<input id="password" type="password" name="j_password"/><br/>
					<br/>
					<input id="rememberMe" type="checkbox" name="_spring_security_remember_me"/><label for="rememberMe">Remember me</label><br/>
					<br/>
					<div align="center">
						<input type="submit" name="" value="Login"/>
					</div>					
					<br/>																		
					<div align="center"><strong>---------- OR ----------<strong></div><br/> 								
					<div align="center">
						<h3>New Users</h3>
						<form>
						  <input type="button" value="Create Account" onClick="window.location.href='registration';"/>						
						</form>									
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>