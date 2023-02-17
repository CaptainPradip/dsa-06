package com.sunbeam;

import java.util.Scanner;

public class RecursionMain {
	public static int power(int x, int y) {
		if(y == 0)
			return 1;
		int res = x * power(x, y-1);
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x and y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = power(x, y);
		System.out.println("Result: " + result);
	}
}
