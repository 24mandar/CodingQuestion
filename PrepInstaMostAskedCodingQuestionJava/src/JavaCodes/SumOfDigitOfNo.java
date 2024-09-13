package JavaCodes;

import java.util.Scanner;

public class SumOfDigitOfNo {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		
		
		
		//Take a value as = 126;
		
		
		while(no>0) {
			
			int r = no%10;  //After modulus 6 will be their as remainder; 126%10====6;  
			
			// what modulus operator will do first it divide and remainder will store in the current variable;
			
			                                                   // 126 ko divide kiya tha toh 12 diviser tha. mag te n madhe store hoill and recursion will be get continue
			sum= sum+r; //  the whole problem is of recursion // Now at first the sum= 6+0 will be their;// 2 Will get add further.
			                                                  // Then 12%10= 2 remainder will be their;
			                                                  // now 
			
			
			no= no/10; 
			
			
			
		}
		
		
		System.out.println(sum);
		
		

	}

}
