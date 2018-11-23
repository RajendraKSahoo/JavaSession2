//This is a program to find the highest among the given 3 numbers.


import java.io.*;
import java.util.Scanner;

class Session2Prg1
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer number: ");
		int x = sc.nextInt();
		System.out.println("Enter second integer number: ");
		int y = sc.nextInt();
		System.out.println("Enter third integer number: ");
		int z = sc.nextInt();

		if( x > y && x > z)
            	System.out.println("The largest number is " +x);

        	else if (y > x && y > z)
		System.out.println("The largest number is " +y);

		else if (z > x && z > y)
		System.out.println("The largest number is " +z);
		
		else
		System.out.println("The numbers are not distinct!");
	
	}
}