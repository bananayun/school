package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBCTemplate04 {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String sql = "select count(*) from student ";
		// 调用JDBCTemplate类对象的queryForObject()方法
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(count);
	}
}
