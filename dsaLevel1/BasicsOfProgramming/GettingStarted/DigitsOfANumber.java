//1. You've to display the digits of a number.
//2. Take as input "n", the number for which digits have to be displayed.
//3. Print the digits of the number line-wise.

package nados.dsaLevel1.BasicsOfProgramming.GettingStarted;

import java.util.Scanner;

public class DigitsOfANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        int power = 1;
        int temp = n;
        while (temp >= 10) {
            temp /= 10;
            power *= 10;
        }
                                
        temp = n;
        while (power != 0) {
            int digit = temp / power;
            System.out.println(digit);
            temp = temp % power;
            power = power / 10;
        }
		
	}

}
