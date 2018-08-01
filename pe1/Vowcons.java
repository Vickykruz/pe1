package com.stackroute.pe1;
import java.util.Scanner;
public class Vowcons {
String st;
void vow()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String ");
	st=sc.next();
	sc.close();
	

 for(int i=0;i<st.length();i++)
 {
	 char s =st.charAt(i);
	 if (s>='a'||s<='z'||s>='A'||s<='Z')
	 {
		 if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U')
		 {
			 System.out.println("Vowel");
			 }
		 else {
			 System.out.println("Consonant");
		 }
		 }
	 else {
		 System.out.println("It is not a Proper String");
		 }
	 }
	 }
public static void main(String args[]) {
	Vowcons b = new Vowcons();
	b.vow();
}
}

 

