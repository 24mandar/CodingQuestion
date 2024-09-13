package JavaCodes;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int no=sc.nextInt();
		
		System.out.println("Enter the exponent no");
		int expo= sc.nextInt();
		
		
		while(expo>0) {
			
			int result=(int) Math.pow(no, expo); // math.pow will return a double so for this a casting will happen as result will get stored in int.
						
			System.out.println(result);
			
			break;   // baher konti condition ny dili to terminate this loop so break steatement will be needed to stop this loop;
			
		}
		
		
		

	}

}
