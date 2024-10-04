package com.MethodReference;

public class Main {
	
	public static String methodA(int a) {	
		if(a>75) {
		return "good";
		}else {
		return "average";
		}
		
	}
	public String methodB(int b){
		
		if(b>75) {
			return "good";
		}else {
			return "average";
		}
		
	}
	public static void main(String[] args) {
		
		intelligence iq = Main::methodA; 
		String result1 = iq.Iqlevel(50);
		System.out.println(result1);
		
		intelligence iq1 = new Main()::methodB;
		String result = iq1.Iqlevel(80);
		System.out.println(result);
	}

}
