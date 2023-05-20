package Array;

public class MinimizeTheHeight {

	public static int getMinDiff(int[] arr, int n, int k) {
		// code here
		// int brr[] = new int[n];
		int diff = 0;
		boolean a = true;
		for (int i = 0; i < n; i++) {
			//brr[i] = arr[i];
			// arr[i] -= k;
			if (arr[i] - k < 0) {
				a = false;
			}
			return diff;
		}
		if (a = false) {
			return ((arr[0] + k) + (arr[n - 1] + k));
		}
		else {
			int a1 = arr[0] -k;
			int a2 = arr[0] +k;
			
			int a3 = arr[n-1] -k;
			int a4 = arr[n-1] + k;
			int res1 = a1 + a2;
			int result ;
		}
		return diff;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 5, 8, 10 };

		int res = getMinDiff(arr, 4, 2);
		System.out.println(res);

	}

}
