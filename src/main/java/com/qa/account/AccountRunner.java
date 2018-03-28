package com.qa.account;

import com.qa.names.AccountNameCounter;

public class AccountRunner {

	public static void main(String[] args) {
		
		Service accountService = new Service();
		AccountNameCounter counter = new AccountNameCounter();
		Account account1 = new Account("Jordan", "McRobert", 206459);
		accountService.addAccount(account1);
		Account account2 = new Account("Jane", "Smith", 240567);
		accountService.addAccount(account2);
		System.out.println(accountService.accountsAsJsonString());
		int numberAccountsJane = counter.countNumberAccountsWithName("Jane", accountService.getAccountList());
		System.out.println("Number of accounts with first name Jane: " + numberAccountsJane);
	}

}
