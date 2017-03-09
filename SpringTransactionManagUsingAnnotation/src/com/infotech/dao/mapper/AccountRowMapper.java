package com.infotech.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infotech.model.Account;

public class AccountRowMapper implements RowMapper<Account> {

	public Account mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		Account account = new Account();
		account.setAccountBalance(rs.getDouble("account_balance"));
		account.setAccountHolderName(rs.getString("account_holder_name"));
		account.setAccountNumber(rs.getLong("account_no"));
		account.setAccountType(rs.getString("account_type"));
		return account;
	}
}
