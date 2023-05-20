package JavaLabDay2;

import java.util.Scanner;

public class MethodInJavaWithReturnType {
    public static void main(String [] args) {
        int result =sum();
        System.out.println("Sum = "+result);
        
    }
    
    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First numbers:");
        int num1 = sc.nextInt();
        System.out.print("Enter Sencond number : ");
        int num2 = sc.nextInt();
        int num3 = num1 + num2;
        return num3;
        
    }

}
