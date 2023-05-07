package JavaLabDay1;

import java.util.Scanner;

public class _9PrintNumberReverse {
    public static void main(String [] args) {
        System.out.println("Enter A number: ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println("Total number of digit in number: ");
        int digit =sc.nextInt();
        
        for(int i=digit;i>=1;--i) {
            long rev=num %10;
            num=num/10;
            System.out.print(rev);
        }
    }

}
