package JavaCodes;

import java.util.Scanner;

//Factors of number; 25/== 1,5 etc;

public class FactorOfNo {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int no= sc.nextInt();
		
		for(int i=1; i<=no;i++) {
			
			if(no%i==0) {
				System.out.println(i+ " ");  // Print the value of i means te factorial print karaycha kam karte kasha kasha ne 
				                             //bhag jato.
			}
			                                 // Jar tya no la tya i cha value ne divide zal completely tr ti i chi value as a factorial mhnun consider keli jail.
			                                 //
		}
		
		
		
	}

}
