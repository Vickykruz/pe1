package com.stackroute.pe1;
import java.util.Scanner;
public class Repeat {
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String");
	String str=s.next();
	System.out.println("Enter the number");
	int n = s.nextInt();
	s.close();
	System.out.print(str);
	for(int i=0;i<n;i++)
	{
		for(int j=str.length()-n;j<str.length();j++)
		{
			System.out.print(str.charAt(j));
		}
	}
		
}
}
