package LinkedList;

import java.util.Stack;

public class AA {

	public static boolean isValid(String s) {
		Stack<Character> stck = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stck.push(s.charAt(i));
				continue;
			}

			if (s.charAt(i) == ')') {
				if (!stck.isEmpty() &&stck.peek() == '(') {
					stck.pop();
				} else {
					return false;
				}
			}

			if (s.charAt(i) == '}') {
				if (!stck.isEmpty() && stck.peek() == '{') {
					stck.pop();
				} else {
					return false;
				}
			}
			if ( s.charAt(i) == ']') {
				if (!stck.isEmpty() && stck.peek() == '[') {
					stck.pop();
				} else {
					return false;
				}
			}

		}
		if (stck.isEmpty()) {
			return true;
		}
		return false;
	}

	public static char nextGreatestLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;
		if (letters[0] >= target)
			return letters[0];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			// int midchar = letters[mid];
			// int targetchar = target;
			if (letters[mid] > target) {
				end = mid - 1;
			} else if (letters[mid] < target) {
				start = mid + 1;
			} else {
				return letters[mid];
			}
		}
		System.out.println(start);
		if (start > letters.length - 1)
			return letters[0];
		return letters[start];
	}
	
	
	public static int reverse(int x) {
        if(x == 0){
            return 0;
        }
        boolean negative = false; 
        int temp =0;
        if(Math.abs(x)+x ==0){
            negative = true;
        } 
        if(negative){
            temp =1;
        }
        String str = "" + x ;
        str = "" + str.substring(temp);
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1.reverse();
        str = str1.toString();
        int res = Integer.parseInt(str);
        if(negative)
            res= res - (res*2);
        return res;
    }

	public static void main(String[] args) {
		//char arr[] = { 'c', 'f', 'j' };
		//char target = 'c';
		//System.out.println(nextGreatestLetter(arr, target));
		//String s ="]";
		//isValid(s);
		String s = new String("5");
		System.out.println(1+10+s+1+10);
		//System.out.println(Integer.MAX_VALUE);
		//int  a = 0;
		//reverse(1534236469);

	}

}
