package demo;

import java.util.Scanner;

public class MenuDriven2 {
	
	static Scanner sc= new Scanner(System.in);	
	static int mat1[][]= {},mat2[][]= {},mat3[][]= {},tempMat[][]= {};
	static int m;
	static int n,choice;
	
	static void createDimesion() {
		System.out.println("enter the dimension : ");
		m=sc.nextInt();
		n=sc.nextInt();
	}
	
	
	static int[][] createMatrix(int tempMat[][]){
		mat3=new int [m][n];
		tempMat=new int[m][n];
		return tempMat;
	}
	
	static int [][] insert(int tempMat[][]){
		mat1=tempMat;
		System.out.println("Enter the values : ");
		for(int row=0;row<m;row++) {
			for(int col=0;col<n;col++) {
				mat1[row][col]=sc.nextInt();
			}
		}
		return mat1;
	}
	
	
	static int [][] traverse(int tempMat[][]){
		for (int row=0;row<m;row++) {
			for(int col=0;col<n;col++) {
				System.out.print(tempMat[row][col] + " ");
				}
			System.out.println();
		}
		return tempMat;
	}
	
	
	static int[][] add(int tempMat[][], int tempMat2[][]){
		
		for(int row=0;row<m;row++) {
			for(int col=0;col<n;col++) {
				mat3[row][col]=tempMat[row][col]+tempMat2[row][col];
			}
		}
		
		return traverse(mat3);
	}
	
	static int[][] sub(int tempMat[][], int tempMat2[][]){
		for(int row=0;row<m;row++) {
			for(int col=0;col<n;col++) {
				mat3[row][col]=tempMat[row][col]-tempMat2[row][col];
			}
		}
		
		return traverse(mat3);
	}
	
	static int[][] mul(int tempMat[][],int tempMat2[][]){
		
		for(int row=0;row<m;row++) {
			for (int col=0;col<n;col++) {
				
				for (int temp=0;temp<m;temp++) {
					mat3[row][col]+=tempMat[row][temp]*tempMat2[temp][col];	
				}
			}
		}
	return traverse(mat3);
	}
	
	
	public static void main(String[] args) {
		
		do {
			int tempMat[][]= {}, tempMat2[][] = {};
			
			System.out.println("Welcome to the menu driven program for matrices");
			createDimesion();
			System.out.println("enter values for matrix 1 : ");
			tempMat = createMatrix(tempMat);
			tempMat = insert(tempMat);
			traverse(tempMat);
			
			System.out.println("Enter values for matrix 2 : ");
			tempMat2 = createMatrix(tempMat2);
			tempMat2 = insert(tempMat2);
			traverse(tempMat2);
			
			System.out.println( " *********** Enter your choice ******* ");
			System.out.println("\n 1.add \n 2.sub \n 3.mul \n 4.exit");
			System.out.println("enter your choice : ");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				
				System.out.println("Addition of two Matricies is : ");
				add(tempMat,tempMat2);
				break;
			case 2:
				

				System.out.println("subtraction of two Matricies is : ");
				sub(tempMat,tempMat2);
				break;
			case 3:
				

				System.out.println("multiplication of two Matricies is : ");
				mul(tempMat,tempMat2);
				break;
			case 4:
				System.exit(0);
			}
				
		}while(choice!=4);
	}

}
