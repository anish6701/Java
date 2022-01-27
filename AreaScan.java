package demo1;

import java.util.Scanner;

public class AreaScan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Radius");
		int r = sc.nextInt();
		double pi = 3.14;
		System.out.println("AREA of circle is " + (pi * r * r) + " sqcm");
		sc.close();

	}

}
