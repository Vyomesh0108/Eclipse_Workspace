

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


//@WebServlet("/sem2")
public class semster2 extends HttpServlet 
{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		int m4 = Integer.parseInt(request.getParameter("m4"));
		int m5 = Integer.parseInt(request.getParameter("m5"));
		int m6 = Integer.parseInt(request.getParameter("m6"));
		
		int total = m4+m5+m6;
		float per = (float)total/3;
		
		HttpSession h2 = request.getSession();
		
		h2.setAttribute("per2", ""+per);
		
		
		
		PrintWriter pw = response.getWriter();
		
		pw.write("<BR> TOTAL = "+total);
		pw.write("<br> PER = "+per);
		
		request.getRequestDispatcher("/final.jsp").include(request, response);
		
	}

}
