package nados.dsaLevel1.BasicsOfProgramming.Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = 2; k <= i; k++) {
				System.out.print("\t");
			}

			for (int j = n; j >= i; j--) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

}
