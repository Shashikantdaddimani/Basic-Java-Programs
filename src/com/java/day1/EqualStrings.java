package com.java.day1;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class EqualStrings 	
{
		//main method
	public static void main(String[] args) 
	{
		//Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first String");
		String string1 = input.next();
		
		System.out.println("Enter the Second String");
		String strring2 = input.next();
		
		//Logic to check the both the Strings are equal or not
		if(string1.equals(strring2))
			System.out.println("Both Strings are equal");
		else
			System.out.println("Both Strings are not equal");
		
		
	}
	

}
