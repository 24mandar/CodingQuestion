package JavaCodes;

import java.util.Scanner;

public class Reverseofanumber {
	public static void main(String[] args) {
		int temp;
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		int b= sc.nextInt();
		
		if(a>0 && b>0) {
			
			temp= a;
			a=b;
			b=temp;
			
			System.out.println("The Value after Swapping "+ a+ " and " +b);
			
			
		}
		
		
		
		
		
	}

}
