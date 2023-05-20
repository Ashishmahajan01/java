package Array;

import java.util.Arrays;

public class Array {
	
	
	
	public static boolean isFit (int arr[], int brr[]) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
       Arrays.sort(brr);
       System.out.println(Arrays.toString(brr));
       for(int i =0;i<arr.length;i++){
           if(arr[i] <= brr[i] &&arr[i]>=0){
               
           }
           else {
               return false;
           }
           
       }
       return true;
   }
   
	public static void main(String [] args) {
		int arr[]= {16 ,82 ,58, 24, 37, 62, 24, 0};
		int brr[]= {36, 52, 99, 79, 50 ,68 ,71, 73};
		boolean a = isFit(arr, brr);
		System.out.println(a); 
	}

}
