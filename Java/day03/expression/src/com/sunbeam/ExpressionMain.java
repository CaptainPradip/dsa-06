package com.sunbeam;

import java.util.Stack;

public class ExpressionMain {
	public static int pri(char op) {
		switch(op) {
		case '$':	return 7;
		case '*':	return 4;
		case '/':	return 4;
		case '+':	return 2;
		case '-':	return 2;
		}
		return 0;
	}
	public static String infixToPostfix(String infix) {
		String postfix = "";
		Stack<Character> s = new Stack<>();
		//1. traverse infix expr from left to right
		for(int i=0; i<infix.length(); i++) {
			char sym = infix.charAt(i);
			// 2. if symbol is operand, append to postfix
			if(Character.isDigit(sym))
				postfix += sym;
			// 5. if symbol is (, then push it on stack
			else if(sym == '(')
				s.push(sym);
			// 6. if symbol is ), then pop all operators from stack and append to postfix until ( is found
			else if(sym == ')') {
				while(s.peek() != '(')
					postfix += s.pop();
				s.pop(); // also pop and discard (
			}
			// 3. if symbol is operator, push on stack
			else { // if operator
				// if priority of topmost operator is greater or equal to the priority of the current operator, then pop it and append to postfix
				while( !s.isEmpty() && pri(s.peek()) >= pri(sym) )
					postfix += s.pop();
				s.push(sym);
			}
		}
		// 4. when all syms from infix are completed, pop all and append to postfix
		while(!s.isEmpty())
			postfix += s.pop();
		return postfix;
	}
	
	public static String infixToPrefix(String infix) {
		String prefix = "";
		Stack<Character> s = new Stack<>();
		//1. traverse infix expr from right to left
		for(int i=infix.length()-1; i>=0; i--) {
			char sym = infix.charAt(i);
			// 2. if symbol is operand, append to prefix
			if(Character.isDigit(sym))
				prefix += sym;
			// 5. if symbol is ), then push it on stack
			else if(sym == ')')
				s.push(sym);
			// 6. if symbol is (, then pop all operators from stack and append to prefix until ) is found
			else if(sym == '(') {
				while(s.peek() != ')')
					prefix += s.pop();
				s.pop(); // also pop and discard )
			}
			// 3. if symbol is operator, push on stack
			else { // if operator
				// if priority of topmost operator is greater than the priority of the current operator, then pop it and append to prefix
				while( !s.isEmpty() && pri(s.peek()) > pri(sym) )
					prefix += s.pop();
				s.push(sym);
			}
		}
		// 4. when all syms from infix are completed, pop all and append to prefix
		while(!s.isEmpty())
			prefix += s.pop();
		// 7. reverse prefix and return it
		StringBuilder sb = new StringBuilder(prefix);
		sb.reverse();
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
		String postfix = "", prefix = "";
		postfix = infixToPostfix(infix);
		prefix = infixToPrefix(infix);
		System.out.println("Postfix: " + postfix);
		System.out.println("Prefix: " + prefix);
	}
}
