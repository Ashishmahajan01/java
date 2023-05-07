package JavaLabDay3Pattern;

public class NumberPattern8 {

    public static void main(String[] args) {
        
/*
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 
 */
        int n=5;
        for(int i=1;i<n;i++) {
            for(int j=2;j<=i;j++) {
                System.out.print(" ");
            }
            int p =1;
            p=p-1+i;
            for(int j =i;j<=n;j++) {
                System.out.print(p++ +" ");
            }
            
            System.out.println();
        }
        for(int k=1;k<=n;k++) {
            for(int l =k ; l<n;l++) {
                System.out.print(" ");
            }
            int p=5;
            p=p-k+1;
            for(int m=1;m<=k;m++) {
                System.out.print(p++ +" ");
            }
            System.out.println();
        }

    }

}
