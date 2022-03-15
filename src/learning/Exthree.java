package learning;

import java.util.Scanner;

public class Exthree {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = sc.nextLine(); 
		System.out.println("String is: "+ a);
		
		for (int i=0; i < a.length(); i++) {
			//System.out.println(getCharFromString);
			char ch = a.charAt(i);
			  
	        System.out.println("Character from " + a + " at index " + i + " is " + ch);
		}
		
	}
	
	//public static char getCharFromString(String a, int i)
    //{
      //  return a.charAt(i);
   // }
}
