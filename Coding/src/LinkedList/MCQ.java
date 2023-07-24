package LinkedList;

public class MCQ {

	static int fun() {
		static int x = 0;
		return ++x;
	}

	public void finalize() {
		System.out.println("finalize() method called");
	}

	public static void main(String[] args) {
		MCQ t = new MCQ();
		t.finalize();
		t.finalize();
		t = null;
		System.gc();
		System.out.println("End of main.");

		/*
		 * 
		 * String s1 = "Hello"; String s2="India"; String s3=s1.concat(s2);
		 * 
		 * String s4=s1 + s2;
		 * 
		 * System.out.println("-----------");
		 * System.out.println(Integer.toHexString(System.identityHashCode(s3)));
		 * System.out.println(Integer.toHexString(System.identityHashCode(s4)));
		 * System.out.println("-----------");
		 * 
		 * System.out.println(s3==s4);
		 * 
		 * 
		 * System.out.println("--------------"); int i = 50; System.out.print(~i);
		 * System.out.print(","); System.out.print(~--i); System.out.print(",");
		 * System.out.print(~++i);
		 * 
		 * 
		 */
	}

}
