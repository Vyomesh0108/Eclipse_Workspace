

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/myadmin")
public class AdminPage extends HttpServlet
{
	
	private Object response;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String sub = request.getParameter("sub");
		
		PrintWriter pw = response.getWriter();
		
		if(sub.equals("SHOW DATA"))
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
				
				Statement st = con.createStatement();
			    ResultSet rs = st.executeQuery("select * from user");
			    
			    while(rs.next())
			    {
			    	String us = rs.getString(1);
			    	String pa = rs.getString(2);
			    	
			    	pw.write("<br> USER :"+us+" password :"+pa);
			    }
				
				
				
			}
			
				catch(Exception e)
				
				{
					pw.write("<BR> SHOW DATA ERROR : "+e.getMessage());
				}
		}
		
	else if (sub.equals("DELETE DATA"))
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
			
			Statement st = con.createStatement();
			
			
			request.getRequestDispatcher("/delete.html").forward(request, response);
			
			st.close();
			con.close();
			
		}
		catch(Exception e)
		{
	
			pw.write("<br> DELETE DATA ERROR: "+e.getMessage());
		}
	}
	else if(sub.equals("DELETE"))
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
			
			Statement st = con.createStatement();
			
			String us = request.getParameter("tus");
			
			st.executeUpdate("delete from user where una='"+us+"'");
			
			pw.write("<br> DELETED SUCCESSFULLY");
			
			st.close();
			con.close();
			
		}
		catch(Exception e)
		{
			pw.write("<br> DELETE ERROR "+e.getMessage());
		}
	}
	else if(sub.equals("UPDATE DATA"))
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
			
			Statement st = con.createStatement();
			
			request.getRequestDispatcher("/update.html").forward(request, response);
			
			st.close();
			con.close();
			
		}
		catch(Exception e)
		{
			pw.write("<br> UPDATE DATA ERROR "+e.getMessage());
		}
	}
	else if(sub.equals("UPDATE")) {
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
		
		Statement st = con.createStatement();
		
		String uso = request.getParameter("us");
		String us = request.getParameter("tus");
    	String pa = request.getParameter("tpa");
    	
    	st.executeUpdate("update user set una='"+us+"', pass='"+pa+"' where una='"+uso+"'");
    	
    	pw.write("<br> UPDATED SUCCESSSFULLY ");
    	
    	st.close();
    	con.close();
    	
	}
	catch(Exception e)
	{
		pw.write("<br> UPDATE ERROR :"+e.getMessage());
	}
	}
	
}}
