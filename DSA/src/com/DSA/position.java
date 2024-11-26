package com.DSA;

import java.util.Scanner;

public class position {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the n value:");
		int n = sc.nextInt();
		System.out.println("enter the seconds time:");
		int s = sc.nextInt();
		int pos = 0;
		
		for(int i=0;i<n;i++) {
			if(s<=n) {
				pos=i;
			}else if(s>n) {
				for(int j = n;j<=0;j--) {
					pos = j;
				}
			}
		}
		System.out.println(pos);
	}

}
