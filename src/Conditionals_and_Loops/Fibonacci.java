package Conditionals_and_Loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		//TODO: First approach
		
//		int a = 0;
//		int b = 1;
//		System.out.println(a);
//		System.out.println(b);
//		while(n > 0) {
//			int c = a+b;
//			a = b;
//			b = c;
//			System.out.println(c);
//			n--;
//		}
		
		//TODO: Second approach
		
		int a = 0;
		int b = 1;
		int count = 2;
		while(count <= n) {
			int temp = b;
			b = b+a;
			a = temp;
			count++;
		}
		System.out.println(b);
	}

}
