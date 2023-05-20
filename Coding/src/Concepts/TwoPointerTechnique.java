package Concepts;

public class TwoPointerTechnique {
	
	public static int naivemethod(int arr[], int len, int value ) {
		
		for(int i=0;i<len;i++) {
			for(int j =i+1;j<len;j++) {
				
				// As equal i and j means same element
				if(i==j)
					continue; // continue keyword skips the execution
                              // for following condition
				
				
				// Condition check if pair exists
				if(arr[i]+arr[j] == value)
					return 1;
				
				// By now the array is sorted
				if(arr[i]+arr[j] > value)
					break;               // Break keyword to hault the execution
			}
		}
		return 0;            // No pair found with given sum.
		
	}
	
	
	public static int twopointer(int arr[], int len,int value) {
		int i =0;
		int j =len -1;
		
		while(i<j) {
			
			if(arr[i]+arr[j] ==value)
				return 1;
			
			else if(arr[i]+arr[j] <value) 
				i++;
			
			else
				j--;
		}
		return 0;
	}
	

	public static void main(String[] args) {
		// Declaring and initializing array
		int arr[]= { 2, 3, 5, 8, 9, 10, 11};
		//value we have to find on addition of any 2 element in array
		int value = 17;
		
		System.out.println(naivemethod(arr, arr.length, value));
		System.out.println(twopointer(arr, arr.length, value));

	}

}
