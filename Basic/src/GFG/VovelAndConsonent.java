package GFG;

import java.util.Scanner;

public class VovelAndConsonent {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Check  Your Word If its vowel or consonent");
		char ch= sc.next().charAt(0);
		
		if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'||ch=='U') {
			
			System.out.println("Its a Vowel");
			
		}
		else {
			System.out.println("Its a consonent");
		}
		
	    }
		

	}


