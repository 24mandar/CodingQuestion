package JavaCodes;

import java.util.Scanner;

public class CheckPositiveOrNegativeNO {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		
		
		if(no>0) {
			System.out.println("Positive Number");
		}
		if (no<0){
			System.out.println("Negative Number");
			
			
		}
		
		if(no==0) {
			System.out.println("Number is related to zero");
		}
		
		
		
		

}

}