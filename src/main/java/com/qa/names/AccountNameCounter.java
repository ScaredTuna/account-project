package com.qa.names;

import java.util.Map;

import com.qa.account.Account;

public class AccountNameCounter {
	
	private int numberAccountsWithName;

	public int countNumberAccountsWithName(String name, Map<Integer, Account> accountMap) {
		numberAccountsWithName = 0;
		for(int accountNumber:accountMap.keySet()) {
			if(accountMap.get(accountNumber).getFirstName().equals(name)) {
				numberAccountsWithName++;
			}
		}
		return numberAccountsWithName;
	}

}
