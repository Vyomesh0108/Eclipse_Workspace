

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;


@WebFilter("/filtlog")
public class LoginFilter implements Filter 
{

   
	public void destroy()
	{
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String us = request.getParameter("tus");
		String pa = request.getParameter("tpa");
		
		if(us.equals("CORONA")&& pa.equals("VIRUS"))
		{
			chain.doFilter(request, response);
		}
		else
		{
			PrintWriter pw = response.getWriter();
			pw.write("SORRY! YOU ARE UNAUTHORZIED...");
			
		//	request.getRequestDispatcher("/index.html.").forward(request, response);
			request.getRequestDispatcher("/index.html").include(request, response);
			
		}
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
