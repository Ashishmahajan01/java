package JavaLabDay3Pattern;

public class NumberPattern7 {

    public static void main(String[] args) {
        
/*
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 

 */
        int n=5;
        for(int i=1;i<=n;i++) {
           int z=4;
           int p=1;
           p=p-1+i;
            for(int j=1;j<=i;j++,z--) {
                System.out.print(p +" ");
                p=p+z;
                        
            }
            System.out.println();
        }

    }

}
