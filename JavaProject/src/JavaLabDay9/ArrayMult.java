package JavaLabDay9;

import java.util.Scanner;

public class ArrayMult {
	int arr1[][] = new int[2][2];
	int arr2[][] = new int[2][2];
	int arr3[][] = new int[2][2];
	int count = 0;

	public void inputMatrix() {
		System.out.println("Matrix Addition of 2x2: ");

		Scanner sc = new Scanner(System.in);
		while (count < 2) {
			System.out.println("\nEnter Matrix  Data for " + (count + 1) + " Matrix: \n");
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr1[i].length; j++) {
					System.out.print("Enter Array row [" + i + "] [" + +j + "] Element : ");
					if (count == 0) {
						arr1[i][j] = sc.nextInt();
					} else {
						arr2[i][j] = sc.nextInt();
					}
				}
			}
			count++;
		}
	}

	public void multiLogic() {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr3[i][j] = 0;
				for (int k = 0; k < arr1.length; k++) {
					arr3[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
	}
	
	public void printMatrix() {
		for(int i= 0;i<arr3.length;i++) {
			for(int j = 0 ;j < arr3[i].length;j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ArrayMult a = new ArrayMult();
		a.inputMatrix();
		a.multiLogic();
		a.printMatrix();

	}

}
