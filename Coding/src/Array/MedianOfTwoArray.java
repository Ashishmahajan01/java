package Array;

import java.util.Arrays;

public class MedianOfTwoArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3 };
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int len = nums1.length + nums2.length;
		int[] arr = new int[len];
		for (int i = 0; i < nums1.length; i++) {
			arr[i] = nums1[i];
		}
		System.out.println(Arrays.toString(arr));
		for (int i = nums1.length, j = 0; i < arr.length; i++, j++) {
			arr[i] = nums2[j];
		}
		System.out.println(Arrays.toString(arr));
		double result;
		int mid = arr.length / 2;
		System.out.println(arr[mid]);
		System.out.println(arr[mid - 1]);
		System.out.println(arr[mid] + arr[mid - 1]);
		if (arr.length % 2 == 0) {
			result = (arr[mid] + arr[mid - 1]) / 2.0;
			System.out.println(result);
		} else {
			System.out.println("a" + arr[mid + 1]);
			System.out.println("b" + arr[mid]);
			result = arr[mid + 1];
		}

	}

}
