package String;

public class Thing {
	
	private static int a;
	  
	  public Thing(int x) {
	    a = x;
	  }
	  
	  public static int geta() {
	    return a;
	  }
	  
	  public static void print() {
	    int b = 4;
	    System.out.println(geta() + " " + b);
	  }

	public static void main(String[] args) {
		print();

	}

}
