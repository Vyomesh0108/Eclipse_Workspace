

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/revstr")
public class MyServlet extends HttpServlet
{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String a = request.getParameter("n1");
		
		int l = a.length();
		
		String rev="";
		
		for (int i=l-1;i>=0;i--)
		{
			rev =rev +a.charAt(i);
		}
		
		PrintWriter pw = response.getWriter();
		
		pw.write("<br><br> REVERSE = "+rev);
		
		pw.close();
	}

}
