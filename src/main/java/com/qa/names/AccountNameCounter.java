package com.qa.names;

import java.util.Map;

import com.qa.account.Account;

public class AccountNameCounter {
	
	private int numberAccountsWithName;

	public int countNumberAccountsWithName(String name, Map<Integer, Account> accountMap) {
		numberAccountsWithName = 0;
		accountMap.entrySet().stream().forEach(entry -> {
			if(entry.getValue().getFirstName().equals(name)) {
				numberAccountsWithName++;
			}
		});
		return numberAccountsWithName;
	}

}
