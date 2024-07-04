<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center"> WEL-COME TO THE WORLD OF JSP </h1>

<%
// scriplet for jsp.Used to do java program in jsp file 
Date dd = new Date();
		
out.print("<br> CURRENT DATE ="+dd);

%>

<br><br>
<form name="f1" action="DoSum">

<%
for(int i=1;i<=10;i++)
{
	out.println("<BR>ENTER NO :<input type='text' name='num'>");
}

%>

<br><br> 	<input type="submit" name="sub" value="ADD">

</form>

</body>
</html>