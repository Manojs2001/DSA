//1. You are given a number n.
//2. You've to create a pattern of * and separated by tab as shown in output format.
//	*	
//		*	
//			*	
//				*	
//					*	

package nados.dsaLevel1.BasicsOfProgramming.Patterns;

import java.util.Scanner;

public class Pattern07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        for (int i=1; i<=n; i++){
            for (int j=2; j<=i; j++){
                System.out.print("\t");
            } 
            
            System.out.println("*");
        } 
	}

}
