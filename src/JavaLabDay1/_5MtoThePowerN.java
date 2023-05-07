package JavaLabDay1;

import java.util.Scanner;

public class _5MtoThePowerN {
    public static void main(String []args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter to the power number: ");
        int n =sc.nextInt();
        long a = 1;
        for(int i=1;i<=n;i++) {
           a=a*m;
            
        }
        System.out.println("M*n = " + a);
    }
    

}
