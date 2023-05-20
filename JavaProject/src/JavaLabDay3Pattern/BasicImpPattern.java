package JavaLabDay3Pattern;

public class BasicImpPattern {
    public static void main(String [] args) {
        /*
         increasing pattern
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        int n=5;
        System.out.print("Increasing pattern");
        System.out.println();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Decreasing pattern");
        System.out.println();
        /*
         Decreasing pattern
         * * * * * 
         * * * *
         * * * 
         * * 
         * 
         */
        for(int i=1;i<=n;i++) {
            for(int j=i;j<=n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

}
