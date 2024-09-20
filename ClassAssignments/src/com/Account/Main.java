package com.Account;

public class Main {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.AccountNum=256897575;
		ac.accountName="Jhon";
		ac.accountType="Savings Account";
		
		System.out.println("Account Number:"+ac.AccountNum);
		System.out.println("Account Name:"+ac.accountName);
		System.out.println("Account Type:"+ac.accountType);
		
		ac.getbalance();

	}

}
