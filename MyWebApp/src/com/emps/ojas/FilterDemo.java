package com.emps.ojas;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterDemo
 */
@WebFilter("/ServletDemo")
public class FilterDemo implements Filter {

	
    public ServletContext sc=null;
    
    public FilterDemo() {
    }
    public void init(FilterConfig filterConfig)throws ServletException {
     
      sc=filterConfig.getServletContext();
    }
    
    public void doFilter(ServletRequest req,ServletResponse res,
    		FilterChain chain)throws IOException,ServletException
    {
        
        String user1=req.getParameter("uname");
        String pass=req.getParameter("upass");
    
         if(user1.equalsIgnoreCase("phani") && pass.equalsIgnoreCase("java")) {
            
        	 req.setAttribute("username",user1);
             chain.doFilter(req,res);
        }
        else
        {
            
            RequestDispatcher rd=sc.getRequestDispatcher("/login.html");
            rd.include(req,res);
           
        }
    }
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
