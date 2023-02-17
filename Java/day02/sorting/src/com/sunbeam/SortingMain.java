package com.sunbeam;

public class SortingMain {
	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void bubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void improvedBubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void furtherImprovedBubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false)
				break;
		}
	}
	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int j, temp = arr[i];
			for(j=i-1; j>=0 && arr[j]>temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = { 5, 6, 3, 8, 4, 2 };
		System.out.print("Before sort: ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + ", ");
		System.out.println();
		
		//selectionSort(arr);
		//bubbleSort(arr);
		//improvedBubbleSort(arr);
		//furtherImprovedBubbleSort(arr);
		insertionSort(arr);
		
		System.out.print(" After sort: ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + ", ");
		System.out.println();
	}

}
