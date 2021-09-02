package Conditionals_and_Loops;

import java.util.Scanner;

public class AlphabetCaseCheck {

	public static void main(String[] args) {
		// TODO Check if it is lowercase or uppercase
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().trim().charAt(0);
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase");
		} else if(ch >= 'A' && ch <= 'Z') {
			System.out.println("UpperCase");
		}

	}

}
