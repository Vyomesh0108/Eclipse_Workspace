

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/myadd")
public class MyServlet extends HttpServlet
{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	    int a = Integer.parseInt(request.getParameter("n1"));
	    int b = Integer.parseInt(request.getParameter("n2"));
	    
	    int c = a+b;
	    
	    PrintWriter pw = response.getWriter();
	    
	    pw.write("<br><br> ADDITION = "+c);
	    
	    pw.close();
	}

}
