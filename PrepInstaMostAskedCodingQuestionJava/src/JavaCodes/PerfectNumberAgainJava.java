package JavaCodes;

import java.util.Scanner;

//again java perfect number;
public class PerfectNumberAgainJava {

	public static void main(String[] args) {
		
		int sum=0;
		
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		
		
		for(int i=1; i<no; i++) {
			
			if(no%i==0) {
				
			 sum= sum+i;
				
				
			}
			
		}
		
		if(sum==no) {
			System.out.println("perfect No");
		}
		else {
			System.out.println("Unperfect No");
		}
		
		
		

	}

}
