package JavaCodes;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		
		//We have decided to take palindrome so take example as 121;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number= sc.nextInt();
		
		
		if(isPalindrome(number)) {
			System.out.println(number +"The Number is  Palidrome");
			
			
		}
		else {
			System.out.println(number + "The number is not Palindrome");
			
		}	
		sc.close();

}

	private static boolean isPalindrome(int num) {
		
		int orignal= num;
		int reverse= 0;
		
		while(num!=0) {
			
			int digit= num%10;  //1st iteration 121%10 = 1 as remainder. // for 2nd loop 2 will be remainder 
			reverse=reverse*10+digit; // then the digit is 1 so : 0 *10 + 1; is 1 // for 2nd loop  1*10 +2 = 12;
			num=num/10; // now n value is 12 then it again goes for checking the condition. // for 2nd loop 2 will be goes for check now.
			
			
			
		}
		
		
		
		
		
		
		return orignal==reverse;
	}
}



	


