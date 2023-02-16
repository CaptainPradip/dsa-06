package com.sunbeam;

public class ComplexityMain {
	// O(n)
	public static void factorial(int n) {
		int res = 1;
		for(int i=1; i<=n; i++)
			res = res * i;
		System.out.println("Factorial : " + res);
	}
	
	// O(n * n)
	public static void printMatrix(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	// O(log n)
	public static void decimalToBinary(int n) {
		while(n > 0) {
			System.out.print(n % 2 + " ");
			n = n / 2;
		}
		System.out.println();
	}
	
	// O(1)
	public static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
		}
	}
	
	public static void main(String[] args) {
		//factorial(5);
		
		//int arr[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
		//printMatrix(arr);
		
		//decimalToBinary(9);
		
		printTable(5);
	}

}
