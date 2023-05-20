package JavaLabDay9;

import java.util.Scanner;

public class ArrayAdd2d {
    int arr1[][] = new int[3][3];
    int arr2[][] = new int[3][3];
    int arr3[][] = new int[3][3];
    int count = 0;

    public void inputMatrix() {
        System.out.println("Matrix Addition of 3x3: ");

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

    public void addMatrix() {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            //
            if (i == 1) {
                System.out.print("  +  ");
            } else {
                System.out.print("     ");
            }

            for (int k = 0; k < arr2[i].length; k++) {
                System.out.print(arr1[i][k] + " ");
            }
            if (i == 1) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }
            for (int l = 0; l < arr3[i].length; l++) {
                System.out.print(arr3[i][l] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayAdd2d a = new ArrayAdd2d();
        a.inputMatrix();
        a.addMatrix();
        a.printMatrix();

    }

}
