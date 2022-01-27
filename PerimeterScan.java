package demo1;

import java.util.Scanner;

public class PerimeterScan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of side 1 : ");
		int a = sc.nextInt();
		System.out.println("enter value of side 2 : ");
		int b = sc.nextInt();
		System.out.println("enter value of side 3 : ");
		int c = sc.nextInt();

		System.out.println("Perimeter of the triangle is : " + (a + b + c));
		sc.close();

	}

}
