package GFG;

import java.util.Scanner;

public class FactorialOfNo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // Taking input from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        // Calculate factorial
	        long factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }
	        
	        // Display the result
	        System.out.println("Factorial of " + number + " is " + factorial);
	        
	        scanner.close();
		
		
		

	}

}
