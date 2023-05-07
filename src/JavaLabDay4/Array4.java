package JavaLabDay4;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {
        // Sorting of array element in increasing order 
        // algorithm develop by ASHISH MAHAJAN
        //also know as Selection sort 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Element you want in array :- ");
        int arrelement = sc.nextInt();
        int[] arr = new int[arrelement];

        for (int i = 0, z = 1; i < arr.length; i++, z++) {
            System.out.println("Enter Array element " + z + " :-");
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Given Unsorted array are: ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1, k = i + 1; j < arr.length; j++, k++) {
                while (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }

            }
        }
        System.out.println("Sorted Array is:- ");
        System.out.println(Arrays.toString(arr));

    }

}
