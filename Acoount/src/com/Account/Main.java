package com.Account;

public class Main {

	public static void main(String[] args) {
		
		person p = new person("Sumitra",32,"Female",new account(23,43000,"Savings account"));
		System.out.println(p);
		System.out.println("Name:"+p.getName());
		System.out.println("Age:"+p.getAge());
		System.out.println("Gender:"+p.getGender());
		
		
//		account ac = new account(23,43000,"Savings account");
		
		System.out.println("accountid:"+p.getAccount().getAccountid());
		System.out.println("balance"+p.getAccount().getBalance());
		System.out.println("accountType:"+p.getAccount().getAccountType());
		
		

	}

}
