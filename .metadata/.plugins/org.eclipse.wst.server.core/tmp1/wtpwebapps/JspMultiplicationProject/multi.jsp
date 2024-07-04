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

<%

String nu = request.getParameter("tnu");
String mul = request.getParameter("mul");
	
Cookie c[] = request.getCookies();
	
outer :	if(mul.equals("TABLE"))
		{
			if(c!=null)
			{
				for(int i=0;i<c.length;i++)
				{
					if(c[i].getValue().equals(nu))
					{
						out.print("<br> ALA BHAI AA NUMBER AVI GAYO CHE ...... NA CHALE !!!");
						break outer;
					}
				}
			}
			
			Cookie c1 = new Cookie("direct",nu);
			response.addCookie(c1);
			
			out.print("<br><h1 align='center'><font color='green'> MULTIPLICATION TABLE OF "+nu+" </font></h1>");
			
			out.print("<table align='center' border='5' cellpadding='8' cellspacing='5'>");
			
			for(int j=1;j<11;j++)
			{
				out.print("<tr><th>"+nu+"</th><th> * "+j+"</th><th> = "+(Integer.parseInt(nu)*j)+"</th></tr>");
			}

			out.print("</table>");
		}
%>

</body>
</html>