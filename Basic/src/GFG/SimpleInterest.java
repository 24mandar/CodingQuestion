package GFG;

import java.util.Scanner;


//Principle* Rate*time/100; ==> Simple Interest Formula;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Principle");
		int Principle= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter The rate");                       //Very Imp = Simple Interest = (Principal * Rate * Time) / 100
		int Rate= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the time");
		int time= sc.nextInt();
		sc.nextLine();
		
		double SimpleInterest= (Principle*Rate*time)/100;
		
		 System.out.println("Principal: " + Principle);
		    System.out.println("Interest Rate: " + Rate);
		    System.out.println("Time Duration: " + time);
		    System.out.println("Simple Interest: " + SimpleInterest);

		    sc.close();
		
		
		
		
		
				
				
	}

}
