package JavaLabDay1;

import java.util.Scanner;

public class _7SumOfSeries {
    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Sum of Nth Term:) ");
      
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter Last number: ");
        int l = sc.nextInt();
        
        //System.out.println("Enter Difference number: ");
        //int d = sc.nextInt();
  
        Double finalAns = (double) (l*(a+l)/2);
        
        System.out.println("The addition of nth term is: " + finalAns);
        
        
        
        
        
        
        
    }

}
