package com.Account;

public class AcMain {

	public static void main(String[] args) {
		
		person p = new person("Sumitra",32,"Female");
		System.out.println("Name:"+p.getName());
		System.out.println("Age:"+p.getAge());
		System.out.println("Gender:"+p.getGender());
		
		
		account ac = new account(23,43000,"Savings account");
		
		System.out.println("accountid:"+ac.getAccountid());
		System.out.println("balance"+ac.getBalance());
		System.out.println("accountType:"+ac.getAccountType());
		
		

	}

}
