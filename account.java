package com.Account;

public class account {
	public int accountid;
	public int balance;
	public String accountType;
	
	public account(int accountid, int balance, String accountType) {
		super();
		this.accountid = accountid;
		this.balance = balance;
		this.accountType = accountType;
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	

}
