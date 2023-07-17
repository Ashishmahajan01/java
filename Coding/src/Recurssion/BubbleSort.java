package Recurssion;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {3,2,7,5,3,9,1,7,0,2};
		bsort(arr, arr.length-1, 0);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bsort(int arr[],int r ,int c) {
		if(r==0)
			return;
		if(c < r) {
			if(arr[c] > arr[c+1]) {
				int temp = arr[c];
				arr[c] = arr[c+1];
				arr[c+1] = temp;
			}
			bsort(arr, r, c+1);
		}
		else {
			bsort(arr, r-1, 0);	
		}
	}

}
