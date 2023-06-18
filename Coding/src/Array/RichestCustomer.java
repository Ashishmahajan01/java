package Array;

public class RichestCustomer {
	public static int maximumWealth(int[][] accounts) {
		int maxwealth = 0;
		int cuswealth = 0;
		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts[i].length; j++) {
				cuswealth += accounts[i][j];
			}
			maxwealth = Math.max(maxwealth, cuswealth);
			cuswealth = 0;
		}
		return maxwealth;
	}

	public static void main(String[] args) {
		int arr[][]= {{1,5},{7,3},{3,5}};
		maximumWealth(arr);
	}

}
