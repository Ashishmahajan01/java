package JavaLabDay3Pattern;

public class NumberPattern11 {

    public static void main(String[] args) {
        
/*
1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1 
        
 */
        int n =5;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(j%2==0) {
                    System.out.print("0 ");
                }
                else {
                    System.out.print("1 ");
                }
                
            }
            System.out.println();
        }

    }

}
