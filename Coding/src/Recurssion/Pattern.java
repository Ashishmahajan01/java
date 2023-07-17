package Recurssion;

public class Pattern {
	static void pattern1(int row , int col) {
		if(row == 0)
			return;
		if(col < row) {
			System.out.print("* ");
			pattern1(row, col+1);
			//System.out.print("* ");
		}
		else {
			System.out.println();
			pattern1(row-1, 0);
			//System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		pattern1(5, 0);
	}

}
