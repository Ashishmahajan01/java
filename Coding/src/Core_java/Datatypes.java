package Core_java;

public class Datatypes {

	public static void main(String[] args) {
		
	
		
		/*String binary[] = {
			      "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
			      "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
			    };
			    int a = 3; // 0 + 2 + 1 or 0011 in binary
			    int b = 6; // 4 + 2 + 0 or 0110 in binary
			    int c = a | b;
			    int d = a & b;
			    int e = a ^ b;
			  

			    System.out.println("        a = " + binary[a]);
			    System.out.println("        b = " + binary[b]);
			    System.out.println("      a|b = " + binary[c]);
			    System.out.println("      a&b = " + binary[d]);
			    System.out.println("      a^b = " + binary[e]);
			   */
		
		int a = 25;
		// 1024 512 256 128 64 32 16 8 4 2 1
 		//        25               1 1 0 0 1
		//        2                0 0 0 1 0
		//    
		System.out.println(a<<4); //25 * 16 = 400
		a=-25;
		System.out.println(a<<4);//-25 * 16 = -400
		
			  } 
		
	

}
