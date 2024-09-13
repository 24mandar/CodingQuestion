package JavaCodes;

import java.util.Scanner;

public class ToCheckIfPalindrome {
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String Words= sc.next();
		
		String B = new StringBuilder(Words).reverse().toString();
		
		if(Words.equals(B)) {
			System.out.println("Its An Palindrome");
		}
		else {
			System.out.println("Its Not An Palindrome");
		}
		
		
		
		
	}

	
}
