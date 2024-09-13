package JavaCodes;

import java.util.Scanner;

public class ArmstrongNo {
	
	public static void main(String[] args) {
		
		int temp;
		int sum=0;
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int n= sc.nextInt();
		
		temp= n;
		
		//There is number 153
		
		while(n>0) {
			
			int r= n%10; //150%10== 3 raminder will be theire and divisible by 15;
			sum=(r*r*r)+sum; // now 3*3*3= 27; 27+0=27; so sum=27;
			n=n/10;// 153/10==15; now 15 will go again up
			
			
			
			// now in 2nd Term;
			
			//r=n%10== 15%10==5 is the remainder 
			//125 is the value
			//now sum is 27;
			//then 27+125= 152;
			//then in last line 1 will be remain;
			
			
			
			
			
			
			
			
		}
		if(temp==sum) {
			System.out.println("Its an armstrong no");
		}
		else
			System.out.println("Not an Armstrong no");
		
		
		
	
		
		
		
		
		
		
		

}
}