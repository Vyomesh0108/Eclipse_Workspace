

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checklog")
public class LoginServlet extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.getRequestDispatcher("/authen.jsp").forward(request, response);
	}

}
