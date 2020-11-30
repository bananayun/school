package com.qfedu.resolver;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ModelAndView handleEx(Exception ex) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("error");
		mv.addObject("errorMsg", "全局异常处理："+ex.getMessage());
		return mv;
	}
}