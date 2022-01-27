package demo1;

import java.util.Scanner;

public class AdditionScan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int b = sc.nextInt();
		System.out.println("Addition is : " + (a + b));
		sc.close();
	}

}
