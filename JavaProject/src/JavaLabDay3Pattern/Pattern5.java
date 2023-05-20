package JavaLabDay3Pattern;

public class Pattern5 {

    public static void main(String[] args) {
 /*
* *
** **
*** ***
**** ****
***** *****
****** ******
******* *******
******** *********       
  */
        int n = 8;
        for(int i =1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            for(int k=1;k<=1;k++) {
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        

    }

}
