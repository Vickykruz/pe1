package com.stackroute.pe1;
import java.util.Scanner;
public class Descorder {
	int s,i,temp,j,k,sum=0;
	int a[]=new int[20];
			void arrDesc() {
		Scanner sp = new Scanner(System.in);
		System.out.println("Enter a number");
		s = sp.nextInt();
		sp.close();
		while(s>0) {
			a[i]=s%10;
			s=s/10;
			i++;
		}
		for(j=0;j<i;j++)
		{
			for(k=j+1;k<i;k++)
			{
				if(a[j]<a[k])
				{
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		for(j=0;j<i;j++)
		{
			System.out.println(a[j]);
		}
		
		if(a[j]%2==0)
		{
			sum+=a[j];
		}
		if(sum>15)
		{
			System.out.println("\t true");
		}
		else {
			System.out.println("\t False");
		}
			}
		public static void main(String args[])
		{
			Descorder d =new Descorder();
			d.arrDesc();
		}
	}


