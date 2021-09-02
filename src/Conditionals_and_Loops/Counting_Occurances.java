package Conditionals_and_Loops;

import java.util.Scanner;

public class Counting_Occurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int find = scn.nextInt();
		int count = 0;
		while(n > 0) {
			if(n%10 == find) {
				count++;
			}
			n/=10;
		}
		System.out.println(count);

	}

}
