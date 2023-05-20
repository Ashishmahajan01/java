package JavaLabDay1;

import java.util.Scanner;

public class _2AdditionOfTwoNumber {
    public static void main(String [] args) {
      /*  int n1=20;
        int n2=30;
        int n3=n1+n2;
        System.out.println("Addition= "+n3);*/
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int ch1= sc.nextInt();
        int ch2= sc.nextInt();
        int ch3=ch1 + ch2;
        System.out.println("Addition of "+ ch1 +" + "+ ch2 + " = " + ch3);
        

    }

}
