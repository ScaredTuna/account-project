package com.qa.account;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceTest {

	private Service service;
	
	@Test
	public void test() {
		service = new Service();
		Account account1 = new Account("Joe", "Bloggs", 2065);
		service.addAccount(account1);
		assertEquals(service.getAccountList().size(), 1);
		assertEquals(service.accountsAsJsonString(), "{\"2065\":{\"firstName\":\"Joe\",\"lastName\":\"Bloggs\",\"accountNumber\":2065}}");
		assertEquals(service.retrieveAccount(account1.getAccountNumber()), account1);
		service.removeAccount(account1);
		assertEquals(service.getAccountList().size(), 0);
	}

}
