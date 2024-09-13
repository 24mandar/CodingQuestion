package JavaCodes;

import java.util.Scanner;

public class Sumofdigitsofanumber {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc= new Scanner(System.in);  //126
		int no= sc.nextInt();
		
		while(no>0) {
			
			int r=no%10;
			sum= sum+r;
			
			no=no/10;
			
		}
		System.out.println(sum);
		
		
		
		
		
		

	}

}
