package GFG;

import java.util.Scanner;

public class PerimeterOfReactangle {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value of Length");
		int length= sc.nextInt();
		sc.hasNextLine();
		System.out.println("Enter The value of Breadth");
		int breadth= sc.nextInt();
		
		int perimeter= 2* length* breadth;
		
		System.out.println("The value of perimeter is" + perimeter);
		

	}

}
