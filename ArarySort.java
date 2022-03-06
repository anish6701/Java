package demo;

import java.util.Scanner;

public class ArarySort {
	
	static Scanner sc = new Scanner (System.in);
	static int array[]= {10,11,3,0,8,7,19};
	static int n;
	
	
	static void SearchByIndex() {
		System.out.println("enter the index to be searched : ");
		int n=sc.nextInt();
		for (int i=0;i<array.length;i++) {
			if(i==n) {
				System.out.println(array[i]);}}}
	
	static int SearchByValue(int n) {
		
		System.out.println(" \n enter the value from the array : "  );
		n =sc.nextInt();
		for(int i =0;i<array.length;i++) {
			if(n==array[i]) {
				System.out.println(i);}}
		return (n);}
	
	static void Ascending() {
		
		for (int i =0;i<array.length;i++) {
			for (int j =i+1;j<array.length;j++){
				if (array[i]>array[j]) {
					int temp=array[i];	
					array[i]=array[j];
					array[j]=temp;}}}						//Ascending
	for (int i=0;i<array.length;i++) {
			System.out.print("\t " + array[i]);}}
	
	static void Descending() {
		
		for (int i =0;i<array.length;i++) {
			for (int j =i+1;j<array.length;j++){
				if (array[i]<array[j]) {
					int temp=array[i];	
					array[i]=array[j];
					array[j]=temp;}}}						//Descending
	for (int i=0;i<array.length;i++) {
			System.out.print(" \t " + array[i]);}}
	
	public static void main(String[] args) {
		
		SearchByIndex();
		SearchByValue(n);
		Ascending();
		System.out.println();
		
		
		Descending();
		
		sc.close();
	}

}
