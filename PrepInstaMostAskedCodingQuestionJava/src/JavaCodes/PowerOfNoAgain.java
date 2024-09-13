package JavaCodes;

import java.util.Scanner;

public class PowerOfNoAgain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Base No");
		double base= sc.nextDouble();
		System.out.println("Enter the Exponential No ");
		double expo= sc.nextDouble();
		
		while(expo>0) {
			
			double result= Math.pow(base, expo);
			System.out.println(result);
			break;
			
		}
		
		
		

	}

}
