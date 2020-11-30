package com.qfedu.test;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.*;
import com.qfedu.bean.Student;

public class TestJDBCTemplate06 {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String sql = "select  *  from student ";
		RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
		// 调用JDBCTemplate类对象的query()方法
		List<Student> list = jdbcTemplate.query(sql, rowMapper);
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
