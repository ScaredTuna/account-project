package com.qa.names;

import java.util.Map;
import com.qa.account.Account;

public class AccountNameCounter {

	public long countNumberAccountsWithFirstName(String name, Map<Integer, Account> accountMap) {
		return accountMap.values().stream().filter(entry -> entry.getFirstName().equals(name)).count();
	}

	public long countNumberAccountsWithLastName(String name, Map<Integer, Account> accountMap) {
		return accountMap.values().stream().filter(entry -> entry.getLastName().equals(name)).count();
	}
	
}
