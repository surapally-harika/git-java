package com.bank;

public class Account {
	public static String bankName="SBI";
	public String accountNum;
	public int balance;
	public String accountName;
	

	public Account(String accountNum, int balance, String accountName) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
		this.accountName = accountName;
	}


	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public void details() {
		
		
		System.out.println("account name:"+this.accountName);
		System.out.println("bankName:"+bankName);
		System.out.println("accountnum:"+this.accountNum);
		System.out.println("balance"+this.balance);
	}
	public static void main(String[] args) {
		Account ac = new Account("20S0034B3122",2300,"xyz");
		ac.details();
		
		

	}

}
