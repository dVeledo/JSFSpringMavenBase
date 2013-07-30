package org.dveledo.primefacesMaven.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class AuthorizationFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy()");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		
		/* CÓDIGO DE EJEMPLO 
		HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        //HttpSession session = request.getSession(false);

        String destination = new String(request.getRequestURL());
        if (destination.contains("buenas-practicas")) {
            response.sendRedirect(request.getContextPath() + "/error"); 
        } else {
            chain.doFilter(req, res); 
        }
        */
		 chain.doFilter(req, res); 
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init()");
	}	

}
