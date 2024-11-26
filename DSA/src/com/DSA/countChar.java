package com.DSA;

import java.util.HashMap;

public class countChar {

	public static void main(String[] args) {

		String str = "abcadcabade";
		
		 HashMap<Character, Integer> charCount = new HashMap<>();

	        for (char c : str.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) +1 );
	        }
	        
	        for (HashMap.Entry<Character, Integer> entry : charCount.entrySet()) {
	            char character = entry.getKey();
	            int count = entry.getValue();
	            System.out.println(character + "-" + count);
	        }
	        

	}

}
