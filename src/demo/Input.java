package demo;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n;
		int sum=0;
		int count=0;
		
		do {
			n=sc.nextInt();
			if(n!=0) {
				sum=sum+n;
				count++;
			}
		}while(n!=0);
		
		if(count>0) {
			double avg=(double)sum/count;
			System.out.println("Average:"+avg);
		}else {
			System.out.println("no numbers");
		}
		
	}

}
