<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String str = request.getParameter("str");

StringBuffer sb=new StringBuffer(str);
String t=""+sb.reverse();

if(str.equals(t))
{
	out.println("<br> IT IS PALINDROME");
}
else
{
	out.println("<br> IT IS NOT PALINDROME");
}

%>

</body>
</html>