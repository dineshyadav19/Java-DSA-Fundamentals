package Conditionals_and_Loops_Assignment;

import java.util.Scanner;

public class Intermediate {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		//TODO: Factorial Program
		
//		int n = scn.nextInt();
//		long ans = 1;
//		while(n>0) {
//			ans = ans*n;
//			n--;
//		}                                       
//		
//		System.out.println(ans);
		
		
		//TODO: Sum of digits of number
		
//		int n = scn.nextInt();
//		int ans = 0;
//		while(n > 0) {
//			int rem = n%10;
//			ans += rem;
//			n/=10;
//		}
//		
//		System.out.println(ans);
		
		//TODO: Calculate average of n numbers
		
//		int n = scn.nextInt();
//		
//		int average = (n*(n+1))/2;
//		
//		System.out.println(average);
		
		//TODO: calculate power in java
		
		int number = scn.nextInt();
		int power = scn.nextInt();
		int ans = 1;
		for(int i = 1; i <= power; i++) {
			ans *= number;
		}
		System.out.println(ans);
	}
}


