package com.DSA;

import java.util.Scanner;

public class primeNum {
	
	public static boolean isPrime(int n){    

      for(int i=2; i<=n/2; i++){    
          if(n%i==0)
        	  return false;
      } 
      return true;
  }
  

  public static void main (String[] args) 
  { 
      int N = 10000; 
      for(int i=2; i<=N; i++){
          if(isPrime(i)) {
            System.out.print(i + " ");
          }
      }
		
	}

}
