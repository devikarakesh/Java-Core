package demo;

public class SumOfNaturalNoPattern {
	public static void main(String[] args) {
		
	int num=1;
	int sum=0;
	
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			sum=sum+num;
			System.out.print(sum+" ");
			num++;
		}
		System.out.println();
	}
	}
}
