package String;

public class Practise {
	public static String gcdString(String str1, String str2) {
		String temp=""+str1.charAt(0);
		String temp2=""+str2.charAt(0);
		if(!(temp.equals(temp2)))
			return "";
		boolean flag=true;
		int i=0,len=1;
		String res ="";
		while(flag) {	
			if((len+i)>str1.length() && (len<(str2.length()-1))) {
				return res;
			}
			int j=len+i;
			String s1=str1.substring(i,j);
			String s2=str2.substring(0,len);
			if(s1.equals(s2)) {
				i=j;
				res=s2;
				continue;
			}
			else {
				if((len+1) >str2.length()) {
					flag=false;
					return "";
				}
				len++;
				i=0;
			}
			
			//flag=false;
		}
		return res;

	}

	public static void main(String[] args) {
		String str1 = "ABABABAB";
		String str2 = "ABAB";
		System.out.println(gcdString(str1, str2));
		// gcdOfStrings("LEET","CODE");

	}

	public static String gcdOfStrings(String str1, String str2) {
		StringBuilder str = new StringBuilder();
		int j = 0;
		for (int i = 0; i < str1.length(); i++) {
			// System.out.println(j);
			if (j < str2.length() && str1.charAt(i) == str2.charAt(j)) {
				str.append(str2.charAt(j));
				j++;
				// System.out.println(j);
			} else {
				j = 0;
			}
		}
		String s1 = str.toString();
		if (s1.substring(0, s1.length() / 2).equals(s1.substring(s1.length() / 2, s1.length()))) {
			s1 = s1.substring(0, s1.length() / 2);
		}
		System.out.println(s1);
		return s1;
	}

}
