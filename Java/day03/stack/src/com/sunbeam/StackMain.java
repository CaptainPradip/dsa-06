package com.sunbeam;

import java.util.Scanner;

class Stack {
	private int[] arr;
	private int top;	

	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}
	public void push(int val) {
		top++;
		arr[top] = val;
	}
	public int pop() {
		int val = arr[top];
		top--;
		return val; 
	}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == arr.length-1);
	}
}

public class StackMain {
	public static void main(String[] args) {
		Stack s = new Stack(6);
		Scanner sc = new Scanner(System.in);
		int choice, val;
		do {
			System.out.print("1. Push\n2. Pop\n3. Peek\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // push
				if(s.isFull())
					System.out.println("Stack is Full.");
				else {
					System.out.print("Enter value to Push: ");
					val = sc.nextInt();
					s.push(val);
				}
				break;
			case 2: // pop
				if(s.isEmpty())
					System.out.println("Stack is Empty.");
				else {
					val = s.pop();
					System.out.println("Popped value: " + val);
				}
				break;
			case 3: // peek
				if(s.isEmpty())
					System.out.println("Stack is Empty.");
				else {
					val = s.peek();
					System.out.println("Peeked value: " + val);
				}
				break;
			}
		}while(choice != 0);
	}
}
