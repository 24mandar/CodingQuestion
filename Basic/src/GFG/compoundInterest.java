package GFG;

import java.util.Scanner;

public class compoundInterest {

	public static void main(String[] args) {
		double principle= 1000, rate=10, time=5;
		
		double ci= principle*(Math.pow((1+rate/100), time));
		
		System.out.println(ci);
		
		
		

	}

}
