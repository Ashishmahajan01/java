package JavaLabDay2;

import java.util.Scanner;

public class MethodInJava {
    public static void main(String [] args) {
        sum();
        
    }
    
    
    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First numbers:");
        int num1 = sc.nextInt();
        System.out.print("Enter Sencond number : ");
        int num2 = sc.nextInt();
        int num3 = num1 + num2;
        System.out.println("Sum = " +num3);
        
        
    }

}
