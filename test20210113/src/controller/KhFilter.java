package controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class KhFilter implements Filter{
FilterConfig config;
	
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(config.getInitParameter("encoding"));
		chain.doFilter(request, response);
		HttpSession sesiion = ((HttpServletRequest)request).getSession();
		RequestDispatcher disp = null;
		
		String url = ((HttpServletRequest)request).getRequestURL().toString();
		
		if(request.getParameter("search") != null) {
			disp = request.getRequestDispatcher("/view/searchKH.jsp");
			
		}else {
			disp = request.getRequestDispatcher("/view/searchFial.jsp");
		}
		disp.forward(request, response);
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	this.config = filterConfig;
	}

}
