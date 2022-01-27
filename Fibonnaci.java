package demo1;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the fibonnaci number to be printed : ");
		int num = sc.nextInt();
		int a = 0, b = 1;
		System.out.print(a + " " + b);
		int c;
		for (int i = 0; i <= num; i++) { // for (i=0;i<=10;i++) 2nd type to print the series without taking input from
											// the user
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		sc.close();

	}

}
