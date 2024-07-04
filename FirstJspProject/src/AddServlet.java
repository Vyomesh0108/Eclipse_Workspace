

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/DoSum")
public class AddServlet extends HttpServlet 
{
	

	protected void service(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String num[] = request.getParameterValues("num");
		int s=0;
		
		for (int i=0;i<num.length;i++)
		{
			s = s + Integer.parseInt(num[i]);
		}
		
		PrintWriter pw = response.getWriter();
		
		pw.write("<BR> SUM= "+s);
		
		pw.close();
	}

}
