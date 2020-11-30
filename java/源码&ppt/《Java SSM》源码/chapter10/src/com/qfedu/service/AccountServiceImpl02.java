package com.qfedu.service;

import com.qfedu.dao.AccountDao;

public class AccountServiceImpl02 implements AccountService {
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(Integer from, Integer to, Double money) {
		accountDao.decreaseMoney(from, money);
		accountDao.increaseMoney(to, money);
		accountDao.decreaseMoney(from,money);
		int num = 1/0;
		accountDao.increaseMoney(to,money);

	}
}
