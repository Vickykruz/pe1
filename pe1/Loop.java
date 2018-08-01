package com.stackroute.pe1;
import java.util.Scanner;
public class Loop{
	public static void main(String args[])
	{
		
		Scanner sl = new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sl.nextInt();
		sl.close();
	
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(i +"");
			}
			System.out.println();
		}
		
	}

}
