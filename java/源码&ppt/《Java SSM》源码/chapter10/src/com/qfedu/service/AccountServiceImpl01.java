package com.qfedu.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.*;
import com.qfedu.dao.AccountDao;

public class AccountServiceImpl01 implements AccountService {
	private AccountDao accountDao;
	// 事务管理类
	private TransactionTemplate transactionTemplate;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	@Override
	public void transfer(Integer from, Integer to, Double money) {
		// 调用TransactionTemplate类对象执行execute()方法
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			// 需要在事务环境中执行的代码
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				accountDao.decreaseMoney(from, money);
				accountDao.increaseMoney(to, money);
				accountDao.decreaseMoney(from, money);
				int num = 1 / 0;
				accountDao.increaseMoney(to, money);

			}
		});
	}
}
