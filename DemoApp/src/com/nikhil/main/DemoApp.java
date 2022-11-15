package com.nikhil.main;

public class DemoApp {
	public static void main(String[] args) {
		int[] a = { 10, 20, 45, 67, 89 };
		for (int i : a) {
			System.out.println(i);
		}

		String name = "sachin";
		int count = name.length();
		System.out.println("The length of the String is::" + count);
	}
}
