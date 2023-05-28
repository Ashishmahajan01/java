package JavaDSAday3;

import java.util.Arrays;

public class Arraydistinct {

    public static void main(String[] args) {
        int arr[]= {23,43,45,34,23,13,76,56,3,9,9,9,23};
        
        arraylogic(arr);

    }

    private static void arraylogic(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i+1] == arr[i]) {
                arr[i] =Integer.MIN_VALUE;
                count++;
            }
        }
        int arr1[] =new int [arr.length-count];
        int j =0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == Integer.MIN_VALUE){
                continue;
            }
            arr1[j] =arr[i];
            j++;          
        }
        System.out.println(Arrays.toString(arr1));
        
    }

}
