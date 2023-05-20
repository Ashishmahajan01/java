package JavabasicCode;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
			
		// array = used to store multiple values within a single variable
		//array(0);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of element: ");
		int element= scanner.nextInt();
		System.out.println("Enter the array element: ");
		String[] ash=new String[element];
		for(int i=0;i<element;i++) {
			String arrayelm = scanner.nextLine();
			ash[i]= arrayelm;
			
		}
		for(int i=0; i<ash.length; i++) {
			System.out.println(ash[i]);
		}
		
	}
	static void array(int ab) {
	String[] cars = new String[3];
		
		cars[0] = "Camaro";
		cars[1] = "Corvette";
		cars[2] = "Tesla";
			
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		int a=cars.length;
		a-=2;
		System.out.println(cars[a]);
	
		
		
	}
}