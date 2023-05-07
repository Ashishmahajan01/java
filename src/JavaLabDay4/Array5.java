package JavaLabDay4;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {

    public static void main(String[] args) {
        //Array reverse 
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element :- ");
        int num =sc.nextInt();
        int [] arr =new int[num];
        for(int i=0,k=1;i<arr.length;i++,k++) {
            System.out.println("Enter arr element " + k + " :-");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
       // System.out.println(arr.length/2);
        int j = arr.length-1;
        int k=arr.length/2;
        for(int i=0;i<k;i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }

}
