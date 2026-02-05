package Exam;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int rev=0;
		int p=a;
		while(a>0) {
			int d=a%10;
			rev=rev*10+d;
			a=a/10;
		}
		System.out.println(rev);
		if(rev==p) {
			System.out.println("given number is palindrome"+rev);
		}
		else {
			System.out.println("Given number is not palindrome"+rev);
		}
		
	}
}
