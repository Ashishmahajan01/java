package JavaLabDay10;

import java.util.Scanner;


public class Neonnumber {
 /*
*input = 9
*input cha square karaych
* =81
*8+1= 9
* 
*/
    
    public void NeonNumberLogic() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number : ");
        int inpu =sc.nextInt();
        int temp = (int) Math.pow(inpu, 2);
        int result =0;
        while(temp !=0) {
            result += temp%10;
            temp = temp/10;
        }
        if(result ==inpu) {
            System.out.println("The enter number is neon Number: ");
        }
        else {
            System.out.println("The Enter Number is Not Neon Number: ");
        }
        
        
    }

    public static void main(String[] args) {
        Neonnumber a = new Neonnumber();
        a.NeonNumberLogic();

    }

}
