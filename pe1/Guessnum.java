package com.stackroute.pe1;
import java.util.Scanner;
public class Guessnum {
	void guess(int n)
	{
		int num = 35;
		if(n==num) {
			System.out.println("You Guessed the Correct number");
		}
		else if(n>num){
			System.out.println("You Guessed the Number Higher than that");
		}
		else if(n<num){
			System.out.println("You Guessed the Number Lower than that");
		}
		
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number 1-40");
		int d = s.nextInt();
		Guessnum g = new Guessnum();
		g.guess(d);
		s.close();
		
	}

}
