package com.stackroute.pe1;

import java.util.Scanner;
public class Integer
{
int a,b;
void call()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a num");
		a=s.nextInt();
		s.close();

		if(a>20&&b<30)
	{
			if(a%2==0)
			{
				System.out.println("Tom");
			}
			else
			{
				System.out.println("Jerry");
			}
	}
	   else 
		{
		   System.out.println("It exceeds the value");
	    }
	}
public static void main(String args[]){
	Integer i=new Integer();
	i.call();
	
}
}

