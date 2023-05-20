package Array;

import java.util.Arrays;

public class UnionCode {

	public static void main(String[] args) {
		int[] arr = {1,5,2,2,6,9,1};
		int[] arr2 = {0,10,11,2,1};

		int[] finalarr = new int[arr.length + arr2.length];
		int j = 0;

		for (int i = 0; i < finalarr.length; i++) {
			if (i < arr.length) {
				finalarr[i] = arr[i];
				System.out.println(Arrays.toString(finalarr));
			} else {

				finalarr[i] = arr2[j];
				j++;
				System.out.println(Arrays.toString(finalarr));
			}
		}

		Arrays.sort(finalarr);
		int temp = 0;
		System.out.println(Arrays.toString(finalarr));
		for (int i = 0; i < finalarr.length; i++) {
			for (int k = i + 1; k < finalarr.length; k++) {
				if (finalarr[i] == finalarr[k]) {
					finalarr[i] = Integer.MIN_VALUE;
					System.out.println(Arrays.toString(finalarr));

				}

			}
		}

		for (int i = 0; i < finalarr.length; i++) {
			if (finalarr[i] == Integer.MIN_VALUE)
				continue;
			else
				System.out.print(finalarr[i] + " ");
		}

	}

}
