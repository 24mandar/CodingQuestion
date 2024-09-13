package JavaCodes;

public class LeapYearOrNot {

	public static void main(String[] args) {
		int yr= 2000;
		
		if(yr%4==0&& yr%100==0 && yr%400==0 ) {
			System.out.println("Tha's a leap year");
			
		}
		else {
			System.out.println("Its Not a Leap Year");
		}
		
		

	}

}
