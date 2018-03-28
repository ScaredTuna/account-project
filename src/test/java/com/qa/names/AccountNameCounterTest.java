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
		long accountsSameName = counter.countNumberAccountsWithFirstName("Joe", service.getAccountList());
		long accountsLastName = counter.countNumberAccountsWithLastName("Bloggs", service.getAccountList());
		assertEquals(0, accountsSameName);
		assertEquals(0, accountsLastName);
		Account account1 = new Account("Joe", "Bloggs", 123);
		service.addAccount(account1);
		accountsSameName = counter.countNumberAccountsWithFirstName("Joe", service.getAccountList());
		accountsLastName = counter.countNumberAccountsWithLastName("Bloggs", service.getAccountList());
		assertEquals(1, accountsSameName);
		assertEquals(1, accountsLastName);
		Account account2 = new Account("Jane", "Bloggs", 234);
		Account account3 = new Account("Joe", "Smith", 345);
		service.addAccount(account2);
		service.addAccount(account3);
		accountsSameName = counter.countNumberAccountsWithFirstName("Joe", service.getAccountList());
		accountsLastName = counter.countNumberAccountsWithLastName("Bloggs", service.getAccountList());
		assertEquals(2, accountsSameName);
		assertEquals(2, accountsLastName);
	}

}
