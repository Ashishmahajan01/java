package JavaLabDay4;

import java.util.*;

public class Array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Array element: ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        for(int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }

}
