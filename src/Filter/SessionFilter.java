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
		//��session��ȡ��userid,���Ϊ��˵��û�е�¼,����ת����¼ҳ��. 
		Object obj = session.getAttribute("userId"); 
		if (obj == null) { 
		//��ת����½ҳ�� 
		response.sendRedirect("/Excel2010/index.jsp"); 
		} else { 
		//�����������������������ִ�� 
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
