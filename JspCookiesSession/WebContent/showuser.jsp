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

try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
	Statement st = con.createStatement();
	
	ResultSet rs = st.executeQuery("select * from user");
	
	out.print("<table border='5'>");
	out.print("<tr><th> USER </th><th> PASSWORD </th></tr>");
	
	while(rs.next())
	{
		out.print("<tr><td> "+rs.getString(1)+" </td><td> "+rs.getString(2)+" </td></tr>");
	}
	
	out.print("</table>");
	
	rs.close();
	st.close();
	con.close();
}
catch(Exception e)
{
	out.print("<br> ERROR : "+e.getMessage());
}

 %>

</body>
</html>