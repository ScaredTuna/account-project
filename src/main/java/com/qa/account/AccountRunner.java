package com.qa.account;

public class AccountRunner {

	public static void main(String[] args) {
		
		Service accountService = new Service();
		Account account1 = new Account("Jordan", "McRobert", 206459);
		accountService.addAccount(account1);
		Account account2 = accountService.retrieveAccount(account1.getAccountNumber());
		if(account1.equals(account2)) {
			System.out.println("Account Service works");
		} else {
			System.out.println("Account Service does not work");
		}
		
	}

}
