package demo1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal amount : ");
		float p = sc.nextFloat();
		System.out.println("enter time : ");
		float t = sc.nextFloat();
		System.out.println("enter rate : ");
		float r = sc.nextFloat();

		float SI = (p * t * r) / 100;
		System.out.println("Simple Interest : " + SI);
		sc.close();

	}

}
