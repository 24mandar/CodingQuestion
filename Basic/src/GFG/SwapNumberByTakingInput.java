package GFG;

import java.util.Scanner;

public class SwapNumberByTakingInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1= sc.nextInt();
		
		int num2= sc.nextInt();
		
		if(num1 != num2) {
			
			int temp= num1;
			num1= num2;
			num2= temp;
			
			
			
			
		}
		System.out.println("The Swap value of number is "+ num1+" "+ num2);
		
		

	}

}
