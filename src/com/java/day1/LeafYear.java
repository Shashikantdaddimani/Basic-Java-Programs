package com.java.day1;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter a year to check");
			 int year = sc.nextInt();
			 
			if (year % 400==0) {
				System.out.println(year + " is a leaf year. ");
			}else if (year % 100==0) {
				System.out.println(year + " is a not leaf year. ");
			}else if (year % 4==0) {
					System.out.println(year + " is a leaf year. ");
			}else {
				System.out.println(year+ " is not a leaf year");
				
			}
	}

}
