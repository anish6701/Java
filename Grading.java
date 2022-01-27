package demo1;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks here : ");
		marks = sc.nextInt();

		if (marks < 50) {
			System.out.println("Fail \n Re-appear for the exam next time");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("D grade \n Can do better !!");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("C grade \n Satisfactory");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("B grade \n Good ");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("A grade \n Very Good");
		} else if (marks >= 90 && marks < 100) {
			System.out.println("A+ grade \n Excellent !! Keep It Up ");
		} else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
