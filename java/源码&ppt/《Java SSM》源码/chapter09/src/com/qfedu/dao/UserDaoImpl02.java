package com.qfedu.dao;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.qfedu.bean.Student;
import com.qfedu.dao.UserDao;

public class UserDaoImpl02 extends JdbcDaoSupport implements UserDao {
	@Override
	public void insert(Student student) {
		String sql = "insert into student(sname,age,course) value (?,?,?) ";
		getJdbcTemplate().update(sql, student.getSname(), student.getAge(), student.getCourse());
	}

	@Override
	public void delete(Integer sid) {
		String sql = "delete from student where sid = ?";
		getJdbcTemplate().update(sql, sid);
	}

	@Override
	public void update(Student student) {
		String sql = "update student set sname = ? ,age = ? ,course = ?";
		getJdbcTemplate().update(sql, student.getSname(), student.getAge(), student.getCourse());
	}

	@Override
	public Student selectOne(Integer sid) {
		String sql = "select * from student where sid = ?";
		BeanPropertyRowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
		return getJdbcTemplate().queryForObject(sql, rowMapper, sid);
	}

	@Override
	public List<Student> selectAll() {
		String sql = "select * from student";
		BeanPropertyRowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
		return getJdbcTemplate().query(sql, rowMapper);
	}
}
