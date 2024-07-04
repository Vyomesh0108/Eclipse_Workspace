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

int num = Integer.parseInt(request.getParameter("num"));
int rev=0 ,r;

while(num>=1)
{
	r = num%10;
	rev = (rev*10)+r;
	num = num/10;
}

out.print("<br><r> REVERSE NUMBER = "+rev);

%>

<h1> STRING PALIDROME </h1>

<form name="f2" action="palinstr">

ENTER STRING : <input type="text" name="str"> <br><br>

<input type="submit" name="sub" value="CHECK IT">

</form>

</body>
</html>