package JavaLabDay3Pattern;

public class NumberPattern3 {

    public static void main(String[] args) {
        
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

 */
       int n=5;
       for(int i=1;i<=n;i++) {
           int p=1;
           for(int j=1; j<=i;j++) {
               System.out.print(p++ +" ");
           }
           
           System.out.println();
       }
       for(int k=1;k<=n;k++) {
           int p =1;
           for(int l=k;l<n;l++) {
               System.out.print(p++ +" ");   
           }
           System.out.println();
       }

    }

}
