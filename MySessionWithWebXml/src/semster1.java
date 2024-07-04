

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


// @WebServlet("/sem1")
public class semster1 extends HttpServlet 
{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("tna");
		
		int m1 = Integer.parseInt(request.getParameter("m1"));
		int m2 = Integer.parseInt(request.getParameter("m2"));
		int m3 = Integer.parseInt(request.getParameter("m3"));
		
		
		int total = m1+m2+m3;
		float per = (float)total/3;
		
		HttpSession h1 = request.getSession();
		
		h1.setAttribute("myna", name);
		h1.setAttribute("per1", ""+per);
		
		PrintWriter pw = response.getWriter();
		
		pw.write("<BR> TOTAL = "+total);
		pw.write("<br> PER = "+per);
		
		request.getRequestDispatcher("/result2.jsp").include(request, response);
		
		
	}

}
