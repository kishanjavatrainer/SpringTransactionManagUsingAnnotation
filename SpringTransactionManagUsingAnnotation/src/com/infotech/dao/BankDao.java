package com.infotech.dao;

import com.infotech.dao.exception.InsufficientAccountBalanceException;
import com.infotech.model.Account;

public interface BankDao {
	public abstract void deposit(Account fromAccount,Account toAccount,Double amount);
	public abstract void withdraw(Account fromAccount,Account toAccount,Double amount) throws InsufficientAccountBalanceException;
}
