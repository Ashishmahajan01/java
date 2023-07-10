package String;

public class MergeStrings {

	public static String mergeAlternately(String word1, String word2) {
		String res = "";
		StringBuilder res1=new StringBuilder();
		int i=0;
		while(i<word1.length() && i<word2.length()) {
			res1.append(word1.charAt(i));
			res1.append(word2.charAt(i));
			i++;
		}
		
		if (word1.length() > word2.length()) {
			res1.append(word1.substring(word2.length()));
		} else {
			res1.append(word2.substring(word1.length()));
			
		}
		res = res1.toString();
		return res;
	}

	public static void main(String[] args) {
		String s1="abc";
		String s2 ="pqr";
		System.out.println(mergeAlternately(s1, s2));

	}

}
