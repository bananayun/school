package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBCTemplate03 {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String sql = "CREATE TABLE stu(sid INT PRIMARY KEY AUTO_INCREMENT," + "sname VARCHAR(20), age VARCHAR(20), "+"course VARCHAR(20) )";
		// 调用JDBCTemplate类对象的execute()方法
		jdbcTemplate.execute(sql);
	}
}
