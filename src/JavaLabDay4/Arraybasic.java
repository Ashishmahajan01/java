package JavaLabDay4;

import java.util.Scanner;

public class Arraybasic {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0,k=1;i<arr.length;i++,k++) {
            System.out.println("Enter arr element:- " + k);
            int p=sc.nextInt();//or arr[i]=sc.nextInt(); 
            arr[i]=p;
            
        }
        for(int j=0;j<arr.length;j++) {
            System.out.print( arr[j] + " ");
        }
        /*For print array we can use 
         * for-each loop
         * for(int num: arr){  // num represent element of array
         *  System.out.print(arr + " ");
         *  }
         *  
         *  
         *  
         *  or 
         *  you can print array using array class to string method
         *  System.out.print(Arrays.toString(arr));
         */
        
        

    }

}
