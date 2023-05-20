package JavaLabDay1;

import java.util.Scanner;

public class _4FactorialOfGivenNumber {
    //5
    //1*2*3*4*5
    //
    public static void main(String [] args) {
        
        System.out.println("Enter Any Number");
        Scanner sc = new Scanner(System.in);
        long n = 1;
        int a = sc.nextInt();
        for(int i=1;i<=a;i++) {
          n= n*i;  //or    n *= i;
          
           
        }
        System.out.println("Factorial = " + n );         
        
        
    }
    
    

}
