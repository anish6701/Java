package demo1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check : ");
		int num = sc.nextInt();

		int temp = num;
		int rev = 0, rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (num == rev) {
			System.out.println(num + " Is a Palindrome ");
		} else {
			System.out.println(num + " Is not a Palindrome ");
		}
		sc.close();

	}

}

