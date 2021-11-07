//1. You are given a number n.
//2. You are given a base b. n is a number on base b.
//3. You are required to convert the number n into its corresponding value in decimal number system.

package nados.dsaLevel1.BasicsOfProgramming.FunctionAndArrays;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int d = getValueIndecimal(n, b);
		System.out.println(d);
	}

	public static int getValueIndecimal(int n, int b) {
		int res = 0;
		int p = 1;

		while (n > 0) {
			int dig = n % 10;
			n /= 10;

			res += dig * p;
			p *= b;
		}
		return res;
	}
}