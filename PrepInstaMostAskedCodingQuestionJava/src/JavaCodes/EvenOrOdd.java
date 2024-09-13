package JavaCodes;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no= sc.nextInt();
		
		if(no%2==0) {
			System.out.println("No is Even");
		}
		
		else {
			System.out.println("No is odd");
		}

	}

}
