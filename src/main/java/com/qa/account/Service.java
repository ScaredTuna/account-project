package com.qa.account;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {
	
	private Map<Integer, Account> accountList = new HashMap<Integer, Account>();
	
	public Map<Integer, Account> getAccountList() {
		return accountList;
	}
	
	public Account retrieveAccount(int accountNumber) {
		return accountList.get(accountNumber);
	}

	public void addAccount(Account accountName) {
		accountList.put(accountName.getAccountNumber(), accountName);
	}
	
	public void removeAccount(Account accountName) {
		boolean accountExists = accountList.containsValue(accountName);
		if(accountExists) {
			accountList.remove(accountName.getAccountNumber());
		}
	}
	
	public String accountsAsJsonString() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(accountList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "";
	}
	
}
