//1. You are given a number n.
//2. You are given a digit d.
//3. You are required to calculate the frequency of digit d in number n.

package nados.dsaLevel1.BasicsOfProgramming.FunctionAndArrays;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();
		int f = getDigitFrequency(n, d);
		System.out.println(f);
	}

	public static int getDigitFrequency(int n, int d) {
		int numb = n;
		int count = 0;
		while (numb > 0) {
			int dig = numb % 10;
			numb /= 10;

			if (dig == d) {
				count++;
			}

		}
		return count;
	}
}
