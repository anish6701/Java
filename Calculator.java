package demo1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***** CALCULATOR *****");
		System.out.println("\n 1.+ \n 2.- \n 3.% \n 4.*");
		System.out.println("Enter your choice : ");
		String c = sc.next();
		System.out.println("enter the 1st number : ");
		float a = sc.nextFloat();
		System.out.println("enter the 1st number : ");
		float b = sc.nextFloat();
		switch (c) {
		case "+":
			System.out.println("Addition of two numbers is : " + (a + b));
			break;
		case "-":
			System.out.println("Subtraction of two numbers is : " + (a - b));
			break;
		case "%":
			System.out.println("Division of two numbers is : " + (a % b));
			break;
		case "*":
			System.out.println("Multiplication of two numbers is : " + (a * b));
			break;
		default:
			System.out.println("Invalid choice");

		}
		sc.close();

	}

}
