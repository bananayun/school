package com.qfedu.dao;

import java.util.List;
import org.springframework.jdbc.core.*;
import com.qfedu.bean.Student;

public class UserDaoImpl01 implements UserDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Student student) {
		String sql = "insert into student(sname,age,course) value (?,?,?) ";
		jdbcTemplate.update(sql, student.getSname(), student.getAge(), student.getCourse());
	}

	@Override
	public void delete(Integer sid) {
		String sql = "delete from student where sid = ?";
		jdbcTemplate.update(sql, sid);
	}

	@Override
	public void update(Student student) {
		String sql = "update student set sname = ? ,age = ? ,course = ?";
		jdbcTemplate.update(sql, student.getSname(), student.getAge(), student.getCourse());
	}

	@Override
	public Student selectOne(Integer sid) {
		String sql = "select * from student where sid = ?";
		BeanPropertyRowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
		return jdbcTemplate.queryForObject(sql, rowMapper, sid);
	}

	@Override
	public List<Student> selectAll() {
		String sql = "select * from student";
		BeanPropertyRowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
		return jdbcTemplate.query(sql, rowMapper);
	}
}
