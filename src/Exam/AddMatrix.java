package Exam;

import java.util.Scanner;

public class AddMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows of 1st matrix:");
		int r=sc.nextInt();
		System.out.println("enter the no of cols of 1st matrix:");
		int c=sc.nextInt();
		int [][]m=new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				m[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("given matrix 1:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
//--------------------------------------------------------------------------
		System.out.println("enter the no of rows of 2nd matrix:");
		int r2=sc.nextInt();
		System.out.println("enter the no of cols of 2nd matrix:");
		int c2=sc.nextInt();
		int [][]m2=new int[r2][c2];
		
		for(int k=0;k<r2;k++) {
			for(int l=0;l<c2;l++) {
				m2[k][l]=sc.nextInt();
			}
		}
		
		System.out.println("given matrix 2:");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
		
// ---------------------------sum loop------------------------------------ 
		int [][]sum=new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				sum[i][j]=m[i][j]+m2[i][j];
				
			}
		}
		
	System.out.println("sum :");
		
		for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
				System.out.print(sum[i][j]+" ");
				
		}
			System.out.println();
		}
		
	}
}
