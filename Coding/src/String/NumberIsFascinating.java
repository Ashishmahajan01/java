package String;

import java.util.HashSet;

public class NumberIsFascinating {
	public static boolean isFascinating(int n) {
        int two =2*n;
        int three = 3*n;
        String str = ""+n+two+three;
        HashSet <Integer> hset = new HashSet<>();
        for(int i =0; i<str.length();i++){
            hset.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
       if(hset.contains(0))
            return false;
       if(str.length() == hset.size() )
            return true;
        return false;
        
    }

	public static void main(String[] args) {
		System.out.println(isFascinating(267));

	}

}
