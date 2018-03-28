package com.qa.names;

import java.util.Map;
import com.qa.account.Account;

public class AccountNameCounter {

	public long countNumberAccountsWithName(String name, Map<Integer, Account> accountMap) {
		return accountMap.values().stream().filter(entry -> entry.getFirstName().equals(name)).count();
	}

}
