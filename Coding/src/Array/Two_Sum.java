package Array;


//target =9 then in array any two number add is 9 then return their index 

public class Two_Sum {
	public int[] twoSum(int[] nums, int target) {
        int arr[] = {0,0};
        int sum;
        for(int i = 0;i<nums.length;i++){
            for(int j= i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if(sum == target){
                    arr[0]=i;
                    arr[1]=j;
                    sum =0;
                    return arr;
                }
                else{

                }
            }
            
        }
        return arr;
    }

	public static void main(String[] args) {
		Two_Sum a = new Two_Sum();
		int nums[]= {1,2,3,4,5};
		int target =9;
		a.twoSum(nums, target);
		

	}

}
