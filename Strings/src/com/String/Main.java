package com.String;

public class Main {

	public static void main(String[] args) {
		
		String str = "Harika";
		String str1="Harika";
		String st=new String("Harika");
		String st1=new String("Gayathri");
		System.out.println(str.hashCode());
		System.out.println(st1.hashCode());
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		
		if(str==str1) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}
		if(str==st) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}
		
		if(st==st1) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}
		
		System.out.println(st.equals(st1));
		
		
//		0 1 1 2 3 5 8  13 21
//		int prev = 0;
//		int next = 1;
//		for(int i=0;i<6;i++) {
//		
//				
//				int result = prev+next;
//				
//				prev=next;
//				next=result;
//				System.out.println(result)

		
//		
//		*
//		**
//		***
//		****
//		*****
//		int arr[]= {1,3,5,2,4,7,3};
//		int sum=5;
//		int result=0;
//		int count=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				 if(arr[i]+arr[j]==sum) {
//					count++; 
//					 
//					 
//				 }
//				 
//				
//			}
//		}
//		
//		System.out.print(count);
		
//		int n=5;
//		for(int i=0;i<=5;i++) {
//			for(int j =0;j<i;j++) {
//				System.out.print("*");
//			
//			}
//			System.out.println();
//		}
		
		
		
	}

}
