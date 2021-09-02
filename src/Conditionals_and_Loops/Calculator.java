package Conditionals_and_Loops;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO: Make a Calculator Program
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		int result = 0;
		while(true) {
			char op = scn.next().trim().charAt(0);
			if(op == '+' || op == '-' || op == '/' || op == '%' || op == '*') {
				int a = scn.nextInt();
				int b = scn.nextInt();
				if(op == '+') {
					result = a+b;
				}
				if(op == '-') {
					result = a-b;
				}
				if(op == '/') {
					if(b == 0) {
						System.out.println("Invalid Argument");
					} else {
						result = a/b;
					}	
				}
				if(op == '*') {
					result = a*b;
				}
				if(op == '%') {
					result = a%b;
				}
			} else if(op == 'x' || op == 'X'){
				System.out.println("I am done");
				break;
			} else {
				System.out.println("Invalid Operation");
			}
			System.out.println(result);
		}
		
	}

}
