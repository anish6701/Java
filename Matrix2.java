package demo;

import java.util.Scanner;

public class Matrix2 {
	
	static Scanner sc = new Scanner(System.in);
	static int n ;
	static int m;
	static int mat[][],mat2[][],mat3[][]; 
	
	// create a dimension
	
		static void createDimeniosn() {
			System.out.println("ENter the dimensions : ");
			m=sc.nextInt();
			n=sc.nextInt();
			}
		
		// creating a matrix
		static void createMatrix() {
			mat=new int[m][n];
			mat2=new int[m][n];
			mat3=new int[m][n];
			
			
		}
		
		//insert into the matrix
		static void insert() {
		System.out.println("Enter the values of the matrix1 : ");
		for(int row=0;row<m;row++) {
			for(int col=0;col<n;col++) {
				mat[row][col]=sc.nextInt();
			}
		}}

		static void insert2() {
			System.out.println("Enter the values of the matrix2 : ");
			for(int row=0;row<m;row++) {
				for(int col=0;col<n;col++) {
					mat2[row][col]=sc.nextInt();
				}
			}}
//traverse a matrix
		
		static void traverse() {
		 
		for (int row=0;row<m;row++) {
			for (int col=0;col<n;col++) {
				System.out.print(mat3[row][col] + " ");
			}
			System.out.println();
		}
		}
		
		// multiplication of two matrix
		
		static void mul() {
			for (int row=0;row<m;row++) {
				for (int col=0;col<n;col++) {
					for (int temp=0;temp<n;temp++) {
						mat3[row][col]+=mat[row][temp]*mat2[temp][col];	
					}
					
				}
		}
			
		}
	
	
	public static void main(String[] args) {
		
	createDimeniosn();
	createMatrix();
	insert();
	insert2();
	mul();
	traverse();
	
		sc.close();
	}
}
