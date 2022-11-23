package com.java.day1;

public class SumOfCommandLineArgument {
	public static void main (String as[])
	{
	int number, count=0, sum=0;
	for(int i=0;i<as.length;i++)
	{
	try
	{
		number=Integer.parseInt(as[i]);
	sum= sum+number;
	}
	catch (NumberFormatException e)
	{
	//system.out.println("invalid integer:");
		count++;
	}
	}
	System.out.println("Sum of only valid integers is= "+sum) ;

	System.out.println("Invalid integers are: "+count) ;
	}
	
}
