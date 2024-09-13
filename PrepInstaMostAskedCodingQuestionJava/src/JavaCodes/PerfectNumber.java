package JavaCodes;

import java.util.Scanner;

//Perfect Number Have to find;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int sum=0;
		
		Scanner sc= new Scanner (System.in);
		int no= sc.nextInt();
		
		for(int i=1; i<no; i++) {
			
			if(no%i==0) {
				sum= sum+i;
				
				
				
			}
			
			
			
			
			
		}
		
		if(sum==no) 
			
			System.out.println("Perfect Number");
			
		
		
		else 
			
			System.out.println("Not a perfect Number");
		
		
		sc.close();
		
		
		
		
		

	}

}
