package com.Statement;

public class prime {

	public static void main(String[] args) {
		int n=30;
		int count;
		for(int i=1;i<=n;i++) {
			count=0;
			
			for(int j=2;j<=i-1;j++) {
			
			if(i%j==0) {
				count++;
				break;
				}
					
			}
			if(count==0) {
				System.out.print(" "+i);
			}
		}
		
	}

}
