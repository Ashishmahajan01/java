package Recurssion;

public class Print_1_N {
	static int counter = 1;

	public static void main(String[] args) {
		int i = 1_000_00;
		System.out.println(i);
		PrintNum(10);

	}

	private static void PrintNum(int i) {
		if (counter <= i) {
			System.out.print(counter + " ");
			counter++;
			//long now = System.currentTimeMillis();
			PrintNum(i);
			//System.out.println(System.currentTimeMillis()-now);
		}
		return;

	}

}
