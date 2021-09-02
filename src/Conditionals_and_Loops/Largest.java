package Conditionals_and_Loops;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		//TODO: First approach
		
//		if(a > b && a > c) {
//			System.out.println(a + " is greatest");
//		} else if(b > c) {
//			System.out.println(b + " is greatest");
//		} else {
//			System.out.println(c + " is greatest");
//		}
		
		//TODO: Second Approach
		
//		int max = a;
//		if(b > max) {
//			max = b;
//		}
//		if(c > max) {
//			max = c;
//		}
//		
//		System.out.println(max);
		
		//TODO: Third Approach
		
		int max = Math.max(a, Math.max(b, c));
		System.out.println(max);
	}
}
