package com.stackroute.pe1;

public class Palindrome {
public static void main(String[] args) {
	int r,sum=0,temp;
	int n=8888;
	
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(sum==temp) {
		int s=0,x;
		while(sum>0) {
			x=sum%10;
			if(x%2==0) {
				s=s+x;
			}
			sum=sum/10;
		}
		
	
	if (s>25) {
		System.out.println("It is palindrome and sum of even is greater than 25 ");
	}else
	{
	
		System.out.println("It is palindrome and sum of even is not greater than 25");
	}
	}
	else {
		System.out.println("It is not a palindrome");
	}
	
}
	
}
