package com.spring;

public class simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("operators");
		System.out.println("Arithmetic");
		int a=5,b=3 ;
		System.out.println("a="+a+"  b="+b);
		int result=a+b;
		System.out.println(a+"+"+b+"="+result);
		int result2=a-b;
		System.out.println(a+"-"+b+"="+result2);
		int result3=a/b;
		System.out.println(a+"/"+b+"="+result3);
		int result4=a%b;
		System.out.println(a+"%"+b+"="+result4);
		int result5=a*b;
		System.out.println(a+"*"+b+"="+result5);
		System.out.println("a++="+a++);
		System.out.println("a--="+a--);
		System.out.println("++a="+(++a));
		System.out.println("Assignment");
		a+=5;
		System.out.println(a);
		b-=1;
		System.out.println(b);
		a*=b;
		System.out.println(a);
		a/=b;
		System.out.println(a);
		a%=b;
		System.out.println(a);
		System.out.println("Left Shift Operator");
		System.out.println(10<<2);//10*2^2
		System.out.println(10<<3);//10*2^3
		System.out.println("Right Shift Operator");
		System.out.println(10>>2);//10/2^2
		System.out.println(10>>3);//10/2^3
		a=4;
		b=2;
		System.out.println(a<b && b>a++);
		System.out.println(a);
		System.out.println(a<b & b++<a);
		System.out.println(b);
		System.out.println(a<b || b>a++);
		System.out.println(a);
		System.out.println(a<b | b++<a);
		System.out.println(b);
		System.out.println(b>a ? a : b);
		
		
		
		
		
		
		
//		int result1=a&b;
//		System.out.println(result1);
		
	}

}
