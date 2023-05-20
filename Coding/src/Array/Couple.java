package Array;

import java.util.Arrays;

public class Couple {

	public static void main(String[] args) {
		int arr[] = {82,12,31,42,82,1,6,12,19,55,66,77,66};
		logic(arr);

	}

	private static void logic(int[] arr) {
		int arr1[] = new int[arr.length];
		int count=0;
		int ith=0;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		while(count<arr.length-1) {
			if(arr[count] == arr[count+1]) {
				count +=2;
			}
			else {
				arr1[ith] = arr[count];
				ith++;
				count++;
			}
		}
		int arr2[] = new int[ith];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
	}

}
