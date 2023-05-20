package core;

import java.util.Scanner;

public class NumberWithSpace {

	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 or 2 digit number: ");
		String str =sc.next();
		
		conversion(str);

	}

	public static void conversion(String str) {
		int len =str.length();
		
		if(str.length() >=3) {
			System.out.println("Enter valid number");
			input();
		}
		
		try {
			int num = Integer.parseInt(str);
			
		} catch (NumberFormatException e) {
			System.out.println("Enter valid number ");
			input();
			//e.printStackTrace();
		}
		
		
		int num = Integer.parseInt(str);
		
		if(str.length() == 1) {
			str = String. format("%03d" , num);	
		}
		else {
			str = String. format("%03d" , num);
		}
		//int num;
		
		
		
		logic(str, num);	

	}
	
	public static void logic(String str, int num) {
		int count = num;
		
		while (count > 0 ) {
			System.out.print("*");  // Star for spaces needed to print
			count--;
		}
		System.out.print(str);
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		input();

	}

}
