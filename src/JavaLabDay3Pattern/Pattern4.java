package JavaLabDay3Pattern;

public class Pattern4 {

    public static void main(String[] args) {
 /*
*       *****************       *
**      ********  *******      **
***     *******    ******     ***
****    ******      *****    ****
*****   *****        ****   *****
******  ****          ***  ******
******* ***            ** *******
**********              *********         
*/
        int n=8;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            for(int k=i;k<n ;k++) {
                System.out.print("  ");
            }
            for(int l=i;l<=n;l++) {
                System.out.print("* ");
            }
            for(int m=1;m<i;m++) {
                System.out.print("  ");
            }
            for(int o=1;o<i;o++) {
                System.out.print("  ");
            }
            for(int p=i;p<=n;p++) {
                System.out.print("* ");
            }
            for(int q=i;q<n;q++) {
                System.out.print("  ");
            }
            for(int r=1;r<=i;r++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        
        
    }

}
