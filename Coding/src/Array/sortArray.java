package Array;

import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
	
	
	public static void sort012()
    {
      /*  Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        System.out.print("Enter array element");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }*/
		int arr[]={0,2,1,2,0};
        int count = 1;
        int num =0;
        while (count <arr.length){
            if(arr[num] > arr[count]){
                int temp = arr[num];
                arr[num]= arr[count];
                arr[count]=temp;
                
            }
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }

	public static void main(String[] args) {
		int arr[] = {0,2,1,2,0};
		sort012();
		

	}

}
