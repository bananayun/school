package com.qfedu.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void increaseMoney(Integer id, Double money) {
		jdbcTemplate.update("update account set money = money + ? " + "where id = ? ;", money, id);
	}

	public void decreaseMoney(Integer id, Double money) {
		jdbcTemplate.update("update account set money = money - ? " + "where id = ? ;", money, id);
	}
}
