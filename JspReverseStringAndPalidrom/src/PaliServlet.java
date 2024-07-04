

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/palinstr")
public class PaliServlet extends HttpServlet
{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/palidrome.jsp").forward(request, response);
	}

}
