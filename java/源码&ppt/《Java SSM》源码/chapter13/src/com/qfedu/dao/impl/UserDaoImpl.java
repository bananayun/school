package com.qfedu.dao.impl;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.qfedu.dao.UserDao;
import com.qfedu.pojo.User;
public class UserDaoImpl implements UserDao{
	 private JdbcTemplate jdbcTemplate;
	 public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	 		this.jdbcTemplate = jdbcTemplate;
	 }
	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(
				"select * from t_user where username=? and password=?", 
				new Object[] {username,password},
				new BeanPropertyRowMapper<>(User.class));
	}
}
