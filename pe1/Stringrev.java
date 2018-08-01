package com.stackroute.pe1;
import java.util.Scanner;
public class Stringrev {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String c = sc.next();
		sc.close();
		char a[]=c.toCharArray();
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]);
			
	}

}
