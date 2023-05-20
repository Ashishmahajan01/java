package JavaLabDay3Pattern;

public class NumberPattern10 {
    public static void main(String[] args) {
        
/*
1 2 3 4 5 
2 3 4 5 1 
3 4 5 1 2 
4 5 1 2 3 
5 1 2 3 4
 */
        int n =5;
        for(int i=1;i<=n;i++) {
            int p=i;
            int l=4;
            for(int j=1;j<=n;j++) {
                if(p<=5) {
                    System.out.print(p++ +" ");
                }
                else{
                    System.out.print(n-l+" ");
                    l--;
                }
                 
                
            }
            System.out.println();
        }
        
        
        
        
    }


}
