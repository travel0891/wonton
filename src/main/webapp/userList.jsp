<%@page import="com.travel.controller.UserController"%>
<%@page import="com.travel.model.User"%>
<%@ page language="java" contentType="text/html"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<%
			for (User item : new UserController().viewUser()) {
		%>
		<li><%=item.getIntId()%> - <%=item.getAccount()%> - <%=item.getPassword()%> - <%=item.getCreateTime()%></li>
		<%
			}
		%>
	</ul>
</body>
</html>