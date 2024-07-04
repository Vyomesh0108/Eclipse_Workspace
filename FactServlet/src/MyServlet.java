

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/fact")
public class MyServlet extends HttpServlet
{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		int a = Integer.parseInt(request.getParameter("fa"));
		
		int f=1;
		
		while(a>=1)
		{
			f=f*a;
			a--;
		}
		
		PrintWriter pw = response.getWriter();
		pw.write("<br><br> FACT :"+f);
		
		pw.close();
	}

}
