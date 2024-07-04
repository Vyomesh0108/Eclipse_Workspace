<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> FINAL RESULT </h1>

<%

String name = (String)session.getAttribute("myna");
String per1 = (String)session.getAttribute("per1");
String per2 = (String)session.getAttribute("per2");

out.print("\n FINAL RESULT OF = "+name);

out.print("\n \n RESULT OF SEM1 : "+per1);
out.print("\n RESULT OF SEM2 : "+per2);



%>


</body>
</html>