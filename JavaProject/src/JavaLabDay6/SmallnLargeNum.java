package JavaLabDay6;

import java.util.Arrays;
import java.util.Scanner;

public class SmallnLargeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 10 Number:");
        int [] arr = new int[10];
        for(int i =0;i<arr.length; i++) {
            System.out.print("Enter arr element " + (i+1) +" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Smallest Number in Array is :" + arr[0]);
        System.out.println("largest Number in Array is :" + arr[9]);

        
    }

}
