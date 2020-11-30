package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.*;

public class TestJDBCTemplate08 {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String sql = "delete from student where sid = 4 ";
		// 调用JdbcTemplate类的update()方法执行删除操作
		int result = jdbcTemplate.update(sql);
		if (result > 0) {
			System.out.println("成功删除" + result + "条数据");
		} else {
			System.out.println("数据删除失败");
		}
	}
}
