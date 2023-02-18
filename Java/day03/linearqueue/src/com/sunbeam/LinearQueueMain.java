package com.sunbeam;

import java.util.Scanner;

class LinearQueue {
	private int[] arr;
	private int front, rear;	

	public LinearQueue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	public void push(int val) {
		rear++;
		arr[rear] = val;
	}
	public int pop() {
		front++;
		return arr[front];
	}
	public int peek() {
		return arr[front+1];
	}
	public boolean isEmpty() {
		return (front == rear);
	}
	public boolean isFull() {
		return (rear == arr.length-1);
	}
}

public class LinearQueueMain {
	public static void main(String[] args) {
		LinearQueue q = new LinearQueue(6);
		Scanner sc = new Scanner(System.in);
		int choice, val;
		do {
			System.out.print("1. Push\n2. Pop\n3. Peek\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // push
				if(q.isFull())
					System.out.println("Queue is Full.");
				else {
					System.out.print("Enter value to Push: ");
					val = sc.nextInt();
					q.push(val);
				}
				break;
			case 2: // pop
				if(q.isEmpty())
					System.out.println("Queue is Empty.");
				else {
					val = q.pop();
					System.out.println("Popped value: " + val);
				}
				break;
			case 3: // peek
				if(q.isEmpty())
					System.out.println("Queue is Empty.");
				else {
					val = q.peek();
					System.out.println("Peeked value: " + val);
				}
				break;
			}
		}while(choice != 0);
	}
	/*
	public static void main(String[] args) {
		LinearQueue q = new LinearQueue(6);
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		System.out.println("Is Empty: " + q.isEmpty()); // false
		int val = q.pop();
		System.out.println("Popped: " + val); // 10
		val = q.pop();
		System.out.println("Popped: " + val); // 20
		val = q.pop();
		System.out.println("Popped: " + val); // 30
		val = q.pop();
		System.out.println("Popped: " + val); // 40
		System.out.println("Is Empty: " + q.isEmpty()); // true
	}
	 */
}
