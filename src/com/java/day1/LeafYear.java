package com.java.day1;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class LeafYear {
	//main method
	public static void main(String[] args) {
		//Taking user input
			 Scanner input = new Scanner(System.in);
			 System.out.println("Enter a year to check");
			 int year = input.nextInt();
			 
			//Logic to check the a year is leaf year
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
