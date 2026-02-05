package demo;

import java.util.Scanner;

public class TrianglePatterns {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int triangular = 0;

        System.out.println("The first " + n + " triangular numbers and their patterns:");

        for (int i = 1; i <= n; i++) {
            triangular += i; // sum of first i natural numbers
            System.out.println(triangular + ":");
            
            
            // Print star pattern for this triangle number
            for (int row = 1; row <= i; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(". ");
                }
                System.out.println();
            }
            System.out.println(); // blank line between patterns
        }
        
        
	}

}
