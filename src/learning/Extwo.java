package learning;

import java.util.Scanner;

public class Extwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = sc.nextInt(); 
		if (a == 0)
		{
			System.out.println("number is zero ");
			
		}
		else if (a>0) {
			System.out.println("number is positive ");
		}
		else {
			System.out.println("number is negative" );
		}
	}
	
}
