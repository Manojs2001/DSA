//1. You are given a number n.
//2. You are given a base b1. n is a number on base b.
//3. You are given another base b2.
//4. You are required to convert the number n of base b1 to a number in base b2.

package nados.dsaLevel1.BasicsOfProgramming.FunctionAndArrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sourceBase = scn.nextInt();
		int destBase = scn.nextInt();

		int d = getValue(n, sourceBase, destBase);
		System.out.println(d);
	}

	public static int getValue(int n, int sourceBase, int destBase) {
		int decimal = getValueIndecimal(n, sourceBase);
		int dn = getValueInAnyBase(decimal, destBase);

		return dn;
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

	public static int getValueInAnyBase(int n, int b) {
		int res = 0;
		int p = 1;

		while (n > 0) {
			int dig = n % b;
			n /= b;

			res += dig * p;
			p *= 10;
		}
		return res;
	}
}