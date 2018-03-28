package com.qa.names;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.account.Account;
import com.qa.account.Service;

import junit.framework.Assert;

public class AccountNameCounterTest {

	Service service;
	AccountNameCounter counter;
	
	@Test
	public void test() {
		service = new Service();
		counter = new AccountNameCounter();
		int accountsSameName = counter.countNumberAccountsWithName("Joe", service.getAccountList());
		assertEquals(0, accountsSameName);
		Account account1 = new Account("Joe", "Bloggs", 123);
		accountsSameName = counter.countNumberAccountsWithName("Joe", service.getAccountList());
		assertEquals(1, accountsSameName);
		Account account2 = new Account("Jane", "Bloggs", 234);
		Account account3 = new Account("Joe", "Smith", 345);
		accountsSameName = counter.countNumberAccountsWithName("Joe", service.getAccountList());
		assertEquals(2, accountsSameName);
	}

}
