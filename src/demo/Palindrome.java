package demo;

public class Palindrome {
	public static void main(String[] args) {
		int n=121;
		int p=n;
		int rev=0;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(rev==p) {
			System.out.println(p+" "+"is palindrome");
		}
		else {
			System.out.println(p+" "+"is not palindrome");
		}
	}

}
