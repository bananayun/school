package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBCTemplate02 {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String sql = "insert into student (sname ,age,course) value (? , ?,?)";
		// 调用JDBCTemplate类对象的update()方法
		int result = jdbcTemplate.update(sql, "ZhaoLiu", "21", "Java");
		if (result > 0) {
			System.out.println("成功添加" + result + "条数据");
		} else {
			System.out.println("数据添加失败");
		}
	}
}
