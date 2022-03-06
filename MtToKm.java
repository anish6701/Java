package demo;

import java.util.Scanner;

public class MtToKm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double km;
		
		System.out.println("enter the meteres");
		int m =sc.nextInt();
		
		km=m/1000.00;
		
		
		System.out.println("kilometer is : " +km);
		sc.close();
	}

}
