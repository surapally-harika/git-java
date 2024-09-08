package com.typecasting;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=34;
		short s=b;
		System.out.println("byte to short-	"+s);
		short s1=35;
		byte b1=(byte)s1;
		System.out.println("short to byte-	"+b1);
		int a=123;
		long l=a;
		System.out.println("int to long-	"+l);
		long l1=345784565;
		int n=(int)l1;
		System.out.println("long to int-	"+n);
		float f=34.3435f;
		double d=f;
		System.out.println("float to double-   "+d);
		double d1=32456.23456;
		float f1=(float)d1;
		System.out.println("double to float-   "+f1);
		int n1=65;
		char c=(char)n1;
		System.out.println("int to char-	"+c);
		double n2=(double)d1;
		System.out.println("int to double-	"+n2);
		char c1='h';
		double d2 =c1;
		System.out.println("char to double-   "+d2);
		byte b2=(byte)n;
		System.out.println("int to byte-  "+b2);
		
		
	}

}
