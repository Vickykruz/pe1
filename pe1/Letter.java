package com.stackroute.pe1;
import java.util.Scanner;
public class Letter {
	public static void main(String args[]) {
	char a;
	Scanner sl = new Scanner(System.in);
	System.out.println("Enter a Character");
	a=sl.next().charAt(0);
	sl.close();
	if(a>='a'&& a<='z')
	{
		System.out.println("LowerCase");
	}
	if(a>='A'&& a<='Z')
	{
		System.out.println("CapitalCase");
	}
	if(a>=0 && a<=9)
	{
		System.out.println("Digits");
	}
	if((a>=32 && a<=47)||(a>=58 && a<=64)||(a>=91 && a<=96)||(a>=123 && a<=126)) {
        System.out.println("Special Characters");
	}
	}
}
