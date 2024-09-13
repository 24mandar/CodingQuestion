package GFG;

public class armstrongNo {

	public static void main(String[] args) {
//		int number=371;
//		int result=0;
//		int temp= number;
		
//		while(temp>0) {
//			
//			int remainder= temp%10;
//			result+= remainder*remainder*remainder;
//			temp/=10;
//			
//			
//		}
//		
//		if (result == number) {
//            System.out.println(number + " is an Armstrong number.");
//        } else {
//            System.out.println(number + " is not an Armstrong number.");
//        }
		
		int number=371;
		int result=0;
		int temp= number;
		
		while(temp>0) {
			
			int remainder= temp%10;
			result= result + remainder*remainder*remainder;
			temp = temp/10;
			
			
		}
		if(result== number) {
			
			System.out.println("Armstrong Number");
			
		}
		else {
			System.out.println("Not armstrong no");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
