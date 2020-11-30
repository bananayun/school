package com.qfedu.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
public class LoginInterceptor implements HandlerInterceptor {
	private String[] urls= {"login.jsp","userlogin"};
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String url=request.getRequestURI();
		if(checkURL(url)){
			return true;
		}else {
			HttpSession session=request.getSession();
			if(session.getAttribute("user")==null) {
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return true;
			}else {
				return true;
			}
		}
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
	private boolean checkURL(String url) {
		boolean res=false;
		for(String u:urls) {
			if(url.indexOf(u)>-1) {
				res=true;
				break;
			}
		}
		return res;
	}
}
