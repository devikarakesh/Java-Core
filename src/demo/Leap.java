package demo;

public class Leap {
	public static void main(String[] args) {
		int y=2024;
		if(y%4==0&&y!=100 ||y%400==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

}
