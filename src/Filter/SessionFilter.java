package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionFilter implements Filter {

	public void init(FilterConfig cong) { 
		// do nothing 
		} 
		public void doFilter(ServletRequest srequest, ServletResponse sresponse, 
		FilterChain chain) { 
		try { 
		HttpServletRequest requst = (HttpServletRequest) srequest; 
		HttpServletResponse response = (HttpServletResponse) sresponse; 
		HttpSession session = requst.getSession(); 
		//从session从取出userid,如果为空说明没有登录,将其转到登录页面. 
		Object obj = session.getAttribute("userId"); 
		if (obj == null) { 
		//跳转到登陆页面 
		response.sendRedirect("/Excel2010/index.jsp"); 
		} else { 
		//如果存在则跳出过滤器继续执行 
		chain.doFilter(srequest, sresponse); 
		} 
		} catch (Exception e) { 
		e.printStackTrace(); 
		} 
		} 
		public void destroy() { 
		//do nothing 
		} 

}
