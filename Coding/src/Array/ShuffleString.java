package Array;

public class ShuffleString {
	
	
	public static String restoreString(String s, int[] indices) {
		
        char []arr = s.toCharArray();
        for(int i=0;i<indices.length;i++) {
        	arr[i]=s.charAt(indices[i]);
        }
       String str = new String (arr);
		return str;
        
    }

	public static void main(String[] args) {
		String s ="codeleet";
		int arr[]= {4,5,6,7,0,2,1,3};
		System.out.println(restoreString(s, arr));

	}

}
