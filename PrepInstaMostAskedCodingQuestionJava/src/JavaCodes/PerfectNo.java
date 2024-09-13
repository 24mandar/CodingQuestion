package JavaCodes;

import java.util.Scanner;

public class PerfectNo {
	
	public static void main(String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		for(int i=1; i<no; i++) {
			if(no%i==0) {
			sum=sum+i;	
							
			}			
		}
		if(no==sum) {
			System.out.println("Perfect No");
		}
		else
			System.out.println("Not a perfect no");
		
		
			
			
			
		}
		
		
	}


