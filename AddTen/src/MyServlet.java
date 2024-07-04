

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/addten")
public class MyServlet extends HttpServlet
{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		int s=0;
		String a[] = request.getParameterValues("t");
		
		int l = a.length;
		
		for(int i=0;i<1;i++)
		{
			s=s+Integer.parseInt(a[i]);
		}
		
		PrintWriter pw = response.getWriter();
		
		pw.write("<br><br> ADDITION "+s);
		
		pw.close();
	}

}
