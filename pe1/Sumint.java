package com.stackroute.pe1;
import java.util.Scanner;
public class Sumint {
public static void main(String args[]) {
	int sum=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a Input");
	int n=sc.nextInt();
	
	int a[] =new int[n];
	System.out.println("Enter a number");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		
	}
	for(int i=0;i<n;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("Sum is"+sum);
	sc.close();
}
}
