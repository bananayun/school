package com.qfedu.dao;

public interface AccountDao {
	void increaseMoney(Integer id, Double money);

	void decreaseMoney(Integer id, Double money);
}
