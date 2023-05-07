package JavaLabDay3Pattern;

public class Numberpattern9 {
    public static void main(String[] args) {
/*
1 
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 */
        int n =5;
        for(int i =1; i<=n;i++) {
            for(int j=1,p=1;j<=i;j++,p++) {
                System.out.print(p +" ");
            }
            int p=i-1;
            for(int k=1;k<=i-1;k++) {
                System.out.print(p--+" ");
            }
            System.out.println();
        }
    }

}
