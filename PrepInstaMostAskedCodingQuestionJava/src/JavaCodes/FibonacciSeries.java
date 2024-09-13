package JavaCodes;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0; 
		int b=1; 
		
		int num=15;
		
		int temp;
		
		
		System.out.println(a+", " + b + ", ");
		
		
		
		for(int i=2; i<num; i++) {
			
			temp = a+b;
			a=b;
			b=temp;
			
			System.out.println(temp + ",");
			
			
			
		}
		
		
		
		
	    	  
	    	  
	      }
	      
	       
	        
	        
	        
	        
	        
	        
	       
}


