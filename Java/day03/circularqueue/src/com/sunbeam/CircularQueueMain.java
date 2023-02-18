package com.sunbeam;

import java.util.Scanner;

class CircularQueue {
	private int[] arr;
	private int front, rear;	

	public CircularQueue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	public void push(int val) {
		rear = (rear+1) % arr.length;
		arr[rear] = val;
	}
	public int pop() {
		front = (front+1) % arr.length;
		int val = arr[front];
		if(front == rear) {
			front = -1;
			rear = -1;
		}
		return val;
	}
	public int peek() {
		int index = (front+1) % arr.length;
		return arr[index];
	}
	public boolean isEmpty() {
		return (front == rear && rear == -1);
	}
	public boolean isFull() {
		return (front == -1 && rear == arr.length-1) || (front == rear && rear != -1);
	}
}

public class CircularQueueMain {
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(6);
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
}
