//1. You've to count the number of digits in a number.
//2. Take as input "n", the number for which the digits has to be counted.
//3. Print the digits in that number.

package nados.dsaLevel1.BasicsOfProgramming.GettingStarted;

import java.util.*;

public class CountDigitsInANumber {

	  
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      
	      int d = 0;
	      
	      while(n != 0){
	          n = n/10;
	          d++;
	      }
	      
	      System.out.println(d);
	   }

}
