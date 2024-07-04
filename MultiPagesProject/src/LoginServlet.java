

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/mylogin")
public class LoginServlet extends HttpServlet
{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String sub = request.getParameter("sub");
		
		String us = request.getParameter("tus");
		String pa = request.getParameter("tpa");
		
		PrintWriter pw = response.getWriter();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
			
			Statement st = con.createStatement();
			
			if(sub.equals("SIGN-UP"))
			{
				st.executeUpdate("insert into user values('"+us+"','"+pa+"')");
				pw.write("<BR> RECORD INSERTED SUCCESSFULLY");
			}
			else if(sub.equals("LOGIN"))
			{
				ResultSet rs = st.executeQuery("select * from user where una='"+us+"' and pass='"+pa+"'");
				
				if(rs.next())
				{
					request.getRequestDispatcher("/adminpage.html").forward(request, response);
				}
				else
				{
					request.getRequestDispatcher("/error.html").forward(request, response);
				}
		        rs.close();
		        
			}
			
			st.close();
			con.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println("\n ERROR : "+e.getMessage());
		}
	}

}
