package com.DSA;

import java.util.Stack;

public class balanced_string {

	public static void main(String[] args) {


		String str = "((()))()()";
		
		Stack<Character> stack = new Stack();
		for(char ch : str.toCharArray()) {
			if(ch == '(') {
			stack.push(ch);
			}else if(ch == ')') {
				if(stack.isEmpty()) {
					System.out.println("not balanced");
					break;
				}
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}
		
	}

}
