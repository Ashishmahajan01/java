package JavaLabDay9;

import java.util.Scanner;

public class Array {
    Scanner sc = new Scanner(System.in);
    static int arr[][] = new int[2][10];
    static int tarr[] = new int[2];

    public void arrayLogic() {

        for (int row = 0; row < 2; row++) {
            System.out.print("Enter column you want in row " + row + ":");
            int temp = sc.nextInt();
            int count = 0;
            for (int column = 0; column < temp; column++) {
                System.out.print("Enter " + (column + 1) + " Element : ");
                arr[row][column] = sc.nextInt();

            }
            tarr[row] = temp;
        }
    }

    public static void arrPrint() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < tarr[i]; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args) {
        Array a = new Array();
        a.arrayLogic();
        a.arrPrint();

    }

}
