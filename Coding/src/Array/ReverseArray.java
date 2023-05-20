package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	static int n;
	Scanner sc = new Scanner(System.in);

	// [1,2,3,4]
	public int[] input() {
		System.out.println("Enter array list: ");
		n= sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Array Element "+(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

	public void logic(int arr[]) {
		int j = arr.length - 1;
		int k = arr.length / 2;
		for (int i = 0; i < k; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}
	public void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rvereseArray(arr, start+1, end-1);
        System.out.println(Arrays.toString(arr));
    }

	public static void main(String[] args) {
		ReverseArray a = new ReverseArray();
		int arr[]=a.input();
		 //a.logic(arr);
		 a.rvereseArray(arr, 0, (n-1));

	}

}
