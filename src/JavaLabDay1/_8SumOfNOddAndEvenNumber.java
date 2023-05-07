package JavaLabDay1;

import java.util.Scanner;

public class _8SumOfNOddAndEvenNumber {
    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Sum of Nth Term:) ");
      
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter Last number: ");
        int l = sc.nextInt();
        
        System.out.println("Enter Difference number: ");
        int d = sc.nextInt();
        
        double n = ((l-a)+d)/d;
        
        Double finalAns = n*(a+l)/2;
        
        System.out.println("The addition of nth number(odd/even) is " +finalAns);

     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
}