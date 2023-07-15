package Recurssion;

public class PrintName {
	static int counter=0;
	static void Print() {
		System.out.print("Ashish ");
		counter++;
		if(counter < 5) {
			Print();
		}
		return;
	}

	public static void main(String[] args) {
		Print();
		
	}

}
