package demo;

import java.util.Scanner;

public class Functions {
	
	static Scanner sc = new Scanner(System.in);
	static float area;
	static int r,a,b,c;
	
	// no return type + no parameter
	static void circle() {
		System.out.print(" Enter the radius of the circle : ");
		r= sc.nextInt();
		double area=Math.PI*r*r;
		System.out.println(" the area of the circle is : " + area);
	}
	
	// no return type + parameter
	static void swap(int a, int b) {
		int temp; 
		 
		 System.out.println("Before Swapping: a= "+a+",b="+b);
		 temp=b;
		 b=a;
		 a=temp;
		 System.out.println("After Swapping: a= "+a+",b="+b);
		 
	}
	
	// return type + no parameter 
	static int triangle() {
		
		System.out.println(" enter the value of a : ");
		a= sc.nextInt();
		System.out.println(" enter the value of b : ");
		b=sc.nextInt();
		System.out.println(" enter the value of c : ");
		c=sc.nextInt();
		System.out.println("\t Perimeter of a triangle is : " +(a+b+c));
		return(a+b+c);
		}
	
	
	// return type + parameter 
	static double Sphere(int r) {
		
		double vol=4/3*Math.PI*r*r*r;
		return vol;
	}
	public static void main(String[] args) {
		
		
		circle();
		triangle();
		swap(10,20);
		System.out.println("Volume of Sphere is: "+Sphere(5));
		
		
		
	}

}
