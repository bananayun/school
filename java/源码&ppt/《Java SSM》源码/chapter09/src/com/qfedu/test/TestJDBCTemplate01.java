package com.qfedu.test;

import org.springframework.jdbc.core.JdbcTemplate;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestJDBCTemplate01 {
	public static void main(String[] args) throws Exception {
		// 创建数据源
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/chapter09");
		dataSource.setUser("root");
		dataSource.setPassword("root");
		// 创建JDBCTemplate类对象
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "insert into student (sname ,age,course) value (? , ?,?)";
		// 调用JDBCTemplate类对象的update()方法
		int result = jdbcTemplate.update(sql, "WangWu", "21", "Java");
		if (result > 0) {
			System.out.println("成功添加" + result + "条数据");
		} else {
			System.out.println("数据添加失败");
		}
	}
}
