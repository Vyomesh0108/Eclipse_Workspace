

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/checklog")
public class LoginServlet extends HttpServlet 
{
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/authe.jsp").forward(request, response);
		Cookie c1;
		
	}

}
