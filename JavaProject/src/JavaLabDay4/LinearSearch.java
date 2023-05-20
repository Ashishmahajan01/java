  package JavaLabDay4;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {23,43,12,4,5,76,33,65,3,9,6};
        int target =11; 
        int ans =linSearch(nums, target);
        System.out.println(ans);

    }
    //search the array :return the index if item found 
    //else return -1
    static int linSearch(int[]arr,int target) {
        if(arr.length == 0) {
            return -1;
        }
        //run a for loop
        for(int i = 0;i<arr.length; i++) {
            //check for element at every index if it is  = target
            int element = arr[i];
            if(element == target) {
                return i;
            }
             
        }
        //this line will execute if none of the above statement have executed
        //hence target not found
        return -1;
        
    }
    static int linSearch2(int[]arr,int target) {
        if(arr.length == 0) {
            return -1;
        }
        //run a for loop
        for(int element : arr) {
            //check for element at every index if it is  = target
            if(element == target) {
                return element;
            }
             
        }
        //this line will execute if none of the above statement have executed
        //hence target not found
        return -1;
        
    }

}
