package JavaLabDay3Pattern;

public class Pattern6 {

/*
* * * * * * * * * * * * 
* * * * *     * * * * * 
* * * *         * * * * 
* * *             * * * 
* *                 * * 
*                     * 
*                     * 
* *                 * * 
* * *             * * * 
* * * *         * * * * 
* * * * *     * * * * * 
* * * * * * * * * * * * 
 */

    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<=n;i++) {
            for(int j=i;j<=n;j++) {
                System.out.print("* ");
            }
            for(int k=0;k<i;k++) {
                System.out.print("  ");
            }
            for(int l=0;l<i;l++) {
                System.out.print("  ");
            }
            for(int m=i;m<=n;m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int z=0; z<=n;z++) {
            for(int y=0;y<=z;y++) {
                System.out.print("* ");
            } 
            for(int x=z;x<n;x++) {
                System.out.print("  ");
            }
            for(int r=z;r<n;r++) {
                System.out.print("  ");
            }
            for(int w=0;w<=z;w++) {
                System.out.print("* ");
            }
            
            System.out.println();

    }

    }
}