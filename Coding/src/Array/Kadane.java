package Array;
import java.lang.Math;
import java.util.Arrays;

class Kadane {
	
	public static int maxSubArray(int arr[],int nums) {
		int sum =0;
		int maxi = arr[0];
		
		for(int i=0; i<arr.length;i++) {
			sum = sum + arr[i];
			maxi =  Math.max(maxi,sum);
			
			if(sum<0)
				sum =0;
			
			}	
		return maxi;
	}
	
	

   
    public static void main(String[] args) {
    	int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
    	int nums = arr.length;
    	int res =maxSubArray(arr,nums);
    	System.out.println(res);
    }
   
    
   
}