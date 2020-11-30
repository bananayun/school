package com.qfedu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.*;
import com.qfedu.bean.Student;

public class TestJDBCTemplate05 {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String sql = "select  *  from student where sid = 1";
		// 创建BeanPropertyRowMapper<Student>类对象
		RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
		// 调用JDBCTemplate类对象的queryForObject()方法
		Student student = jdbcTemplate.queryForObject(sql, rowMapper);
		System.out.println(student);
	}
}
