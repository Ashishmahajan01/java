package JavaLabDay3Pattern;

public class NumberPattern4 {

    public static void main(String[] args) {
        
/*
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1         
 */
        
        int n = 5;
        for(int i=1,z=0;i<=n;i++,z++) {
           int p=5;
           p=p-i+1;
            for(int j=i;j<=n;j++) {
               System.out.print(p-- +" "); 
            }
            System.out.println();
            
        }

    }

}
