package JavabasicCode;

import java.util.Scanner;

public class Array1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//int ch = sc.nextInt();
		/*int arr[] = new int[6];
		
		
		arr[0] =33;
		arr[1] =45;
		arr[2] =65;
		arr[3] =7;
		arr[4] = 2;
		arr[5] = 5;
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
			*/
		System.out.println("Enter array legth: ");
		int a = sc.nextInt();
		String arry[] =new String[a];
		for(int i=0; i<arry.length;i++) {
			System.out.println("Enter array element "+i+" :");
			String ele = sc.nextLine();
			arry[i]= ele;
		}
		
		
		
		
		}
		
	}

