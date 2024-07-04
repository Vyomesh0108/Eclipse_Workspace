
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@ page import="java.sql.*" %>
      
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String us = request.getParameter("tus");
String pa = request.getParameter("tpa");
String keep = request.getParameter("keep");

try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
	Statement st = con.createStatement();
	
	ResultSet rs = st.executeQuery("select * from user where una='"+us+"' and pass='"+pa+"'");
	
	if(rs.next())
	{

		if(keep!=null)
		{
			Cookie c1 = new Cookie("direct", "allow");
			response.addCookie(c1); //it stores cookie in client's browser
	
		}
		
		request.getRequestDispatcher("showuser.jsp").forward(request,response);
	
	}
	else
	{
		request.getRequestDispatcher("error.jsp").forward(request,response);
	}
	
	rs.close();
	st.close();
	con.close();
	
}
catch(Exception e)
{
	out.print("<br> ERROR :"+e.getMessage());
}


%>
 


</body>
</html>