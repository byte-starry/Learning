package learning;

import java.util.Scanner;

public class Exfour {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = sc.nextInt();
		
		String b = Integer.toString(a);
		int c = b.length();
		System.out.println("Length: " + c);
	}

}
