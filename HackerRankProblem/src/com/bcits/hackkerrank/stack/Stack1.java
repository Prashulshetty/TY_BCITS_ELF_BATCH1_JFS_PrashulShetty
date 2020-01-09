package com.bcits.hackkerrank.stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack1 {

	private static boolean check(String str) {
		Stack<Character> st = new Stack<Character>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (c == '{' || c == '[' || c == '(') {
				st.push(c);
			} else {
				if (c == ']' && !st.isEmpty() && st.pop() == '[') {
					continue;
				} else if (c == '}' && !st.isEmpty() && st.pop() == '{') {
					continue;
				} else if (c == ')' && !st.isEmpty() && st.pop() == '(') {
					continue;
				} else {
					return false;
				}
			}
		}
		return st.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(" Enter the String :");
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String s = in.next();
			System.out.println(check(s));
		}

	}
}