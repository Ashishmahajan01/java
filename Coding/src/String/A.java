package String;

public class A {
	
	public static void main(int[] args) {
		System.out.println("Int main method");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		main(args);

	}
	

}
