package JavaLabDay1;

import java.util.Scanner;

public class Fibonacci {
    int num;
    public void acceptNumber(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Range of fibonacci Number: ");
        num = sc.nextInt();
        
    }
    public void fibLogic(){
        int x=0;
        int y=1;
        int z =x+y;
        System.out.print(x + " " + y +" ");
        for(int i=0;i<=num;i++){
            if(z <=num){
                z =x +y;
                int temp = y;
                y = z;
                x = temp;
                System.out.print(z + " ");
                
            }
            
            
        }
        
    }
    public static void main(String [] args){
        Fibonacci a = new Fibonacci();
        a.acceptNumber();
        a.fibLogic();
    }

}
