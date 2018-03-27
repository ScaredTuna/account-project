package com.qa.account;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private Map<Integer, Account> accountList = new HashMap<Integer, Account>();

	public Account retrieveAccount(int accountNumber) {
		return accountList.get(accountNumber);
	}

	public void addAccount(Account accountName) {
		accountList.put(accountName.getAccountNumber(), accountName);
	}
}
