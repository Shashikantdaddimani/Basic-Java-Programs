package com.java.day1;

import java.util.Scanner;

public class EqualStrings {

	public static void main(String[] args) {
		//Taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 = sc.next();
		
		System.out.println("Enter the Second String");
		String s2 = sc.next();
		
		if(s1.equals(s2))
			System.out.println("Both Strings are equal");
		else
			System.out.println("Both Strings are not equal");

	}

}
