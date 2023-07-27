package Array;

public class ArrayMaxOccuranceNumber {
	public static int arraymax (int num, int len, int arr[]) {
		char a= (char)(num+'0');
		if (arr.length ==0)
				return -1;
		int occurance =0;
		int finalnum=0;
		for(int i =0;i<arr.length;i++) {
			String s ="" +arr[i];
			int temp=0;
			for(int j =0;j<s.length();j++) {
				if(s.charAt(j)==a) {
					temp++;
				}
			}
			if(temp>occurance) {
				occurance = temp;
				finalnum=arr[i];
			}
		}
		return finalnum;
	}
	
	public static void main(String[] args) {
		int arr[] = {2153,65,1,12,11,1111};
		System.out.println(arraymax(1, arr.length, arr));
	}
	

}
