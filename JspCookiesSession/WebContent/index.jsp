<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <!-- <%@ include file="header.jsp" %> --> <!-- include directive -->	<!-- JSP tag leaf -->
    
    <jsp:include page="header.jsp"></jsp:include>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

if(request.getParameter("sub")!=null)
{
	Cookie c[] = request.getCookies();	//To fetch all Cookies 
	
	if(c!=null)	//means we received Cookies
	{
		for(int i=0;i<c.length;i++)
		{
			if(c[i].getValue().equals("allows"))
			{
				request.getRequestDispatcher("/showuser.jsp").forward(request, response);
			}
		}
	}

%>

<h1 align="center"> LOGIN PAGE </h1>

<form name="f2" action="checklog">

USERNAME : <input type="text" name="tus"> <br>
PASSWORD : <input type="password" name="tpa"> <br><br>

<input type="submit" name="log" value="LOGIN">
<input type="reset" name="res" value="CANCEl"> <br><br> 

<input type="checkbox" name="keep" value="kept"> KEEP ME LOGGED IN......

</form>

<%

}
else 
{
	
%>


<h1 align="center"> HOME PAGE </h1>

<form name="f1" method="get" action="index.jsp">

<input type="submit" name="sub" value="LOGIN">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

</form>

<%

}

%>

</body>
</html>