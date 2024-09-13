package JavaCodes;

import java.util.Scanner;

public class ReverseANo {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int no1= sc.nextInt();
		
		int no2=sc.nextInt();
		
		System.out.println("The First No is ==> "+no1+ "  And Second no is ==> "+no2);
		
		if(no1==no2) {
			System.out.println("Both is at same level");
		}
		else {
			int temp =no1;
			no1=no2;
			no2= temp;
			System.out.println("After the Swap No1 is ==>  "+ no1+ "After Swap The No2 is ==> "+ no2 );
		}
			
			
			
		
		
		
		
		
		
		
		
		
		
	}

}
