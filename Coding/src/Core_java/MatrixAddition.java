package Core_java;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

	// taking input of matrix from user
	public static void matrixElement(int arr[][], int arr1[][]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element of  Matrix 1: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Row " + (i + 1) + " elements: ");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter Element of  Matrix 2: ");

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter Row " + (i + 1) + " elements: ");
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
	}

	// display array logic
	public static void displayMatrix(int arr[][], int arr1[][]) {
		System.out.println("Matrix 1");
		/*for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}*/
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println("\n Matrix 2");
		/*
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}*/
		System.out.println(Arrays.deepToString(arr));

	}
	//addition and display of result matrix
	public static void Additon(int arr[][],int arr1[][]) {
		int result[][]=new int [3][3];
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				result[i][j]=arr[i][j] + arr1[i][j];
			}
		}
		System.out.println("Result Matrix :");
		System.out.println(Arrays.deepToString(result));
		
		/*
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
		*/

	}

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int arr1[][] = new int[3][3];
		matrixElement(arr, arr1);
		displayMatrix(arr, arr1);
		Additon(arr,arr1);

	}

}
