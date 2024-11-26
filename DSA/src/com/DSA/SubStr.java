package com.DSA;

import java.util.Stack;

public class SubStr {
	
	public static boolean isSubstring(String str1, String str2) {
      

        Stack<Character> stack = new Stack<>();
        int subLen = str2.length();

        for (char ch : str1.toCharArray()) {
            stack.push(ch);
            if (stack.size() >= subLen) {
                boolean isMatch = true;

                Stack<Character> tempStack = new Stack<>();
                for (int i = subLen - 1; i >= 0; i--) {
                    char current = stack.pop();
                    tempStack.push(current);

                    if (current != str2.charAt(i)) {
                        isMatch = false;
                    }
                }

                while (!tempStack.isEmpty()) {
                    stack.push(tempStack.pop());
                }

                if (isMatch) {
                    return true;
                }
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        String str1 = "abcdefga";
        String str2 = "cde";

        if (isSubstring(str1, str2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

	

		
	}

}
