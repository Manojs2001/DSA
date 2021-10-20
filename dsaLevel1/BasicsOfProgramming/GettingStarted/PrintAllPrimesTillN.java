//1. You've to print all prime numbers between a range. 
//2. Take as input "low", the lower limit of range.
//3. Take as input "high", the higher limit of range.
//4. For the range print all the primes numbers between low and high (both included).

package nados.dsaLevel1.BasicsOfProgramming.GettingStarted;

import java.util.Scanner;

public class PrintAllPrimesTillN {
	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int low = sc.nextInt();
	       int high = sc.nextInt();
	       
	       for (int n = low;n <= high ;n++ ){
	           int count = 0;
	           for (int div = 2;div * div <= n ;div++ ){
	               if(n%div == 0){
	                   count++;
	                   break;
	               }
	           }
	           
	           if(count == 0){
	               System.out.println(n);
	           }
	           
	       } 
	       
	    }
	}