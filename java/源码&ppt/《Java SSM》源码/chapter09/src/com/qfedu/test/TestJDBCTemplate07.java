package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.*;

public class TestJDBCTemplate07 {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String sql = "update student set sname='SunQi' where sid = 4 ";
		// 调用JdbcTemplate类的update()方法执行更新操作
		int result = jdbcTemplate.update(sql);
		if (result > 0) {
			System.out.println("成功更新" + result + "条数据");
		} else {
			System.out.println("数据更新失败");
		}
	}
}
