package demo;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string:");
		String s=sc.nextLine();
		
		String result="";
		String word="";
		
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)=='.') {
				result=result+word+".";
				word="";
			}else {
				word=s.charAt(i)+word;
			}	
		}
		result=result+word;
		System.out.println(result);
		
	}
}
