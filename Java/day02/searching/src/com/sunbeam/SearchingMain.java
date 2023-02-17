package com.sunbeam;

import java.util.Scanner;

public class SearchingMain {
	public static int binSearch(int[] arr, int key, int left, int right) {
		if(left > right)
			return -1;
		int i, mid = (left + right) / 2;
		if(key == arr[mid])
			return mid;
		if(key < arr[mid])
			i = binSearch(arr, key, left, mid-1);
		else
			i = binSearch(arr, key, mid+1, right);
		return i;
	}
	public static int binSearch(int[] arr, int key) {
		int index = binSearch(arr, key, 0, arr.length-1);
		return index;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		System.out.print("Enter element to find: ");
		int key = sc.nextInt();
		int index = binSearch(arr, key);
		if(index == -1)
			System.out.println("Element not found.");
		else
			System.out.println("Element found at index: " + index);
	}

}
