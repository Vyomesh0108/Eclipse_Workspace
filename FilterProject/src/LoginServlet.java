

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/filtlog")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		PrintWriter pw = response.getWriter();
		
		pw.write("<BR> WEL-COME AUTHORISED USER");
	}

}
