package com.infotech.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.dao.exception.InsufficientAccountBalanceException;
import com.infotech.model.Account;
import com.infotech.service.BankService;
import com.infotech.service.Impl.BankServiceImpl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		BankService bankService = ctx.getBean("bankService", BankServiceImpl.class);
		Account fromAccount = new Account();
		fromAccount.setAccountNumber(1122330056L);
		
		Account toAccount = new Account();
		toAccount.setAccountNumber(3355330099L);
		
		try {
			bankService.transferFund(fromAccount, toAccount, 1000.00);
		} catch (InsufficientAccountBalanceException e) {
			e.printStackTrace();	
		}
		ctx.close();

	}

}
