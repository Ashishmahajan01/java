package JavaLabDay6;

import java.util.Scanner;

public class Evennumber {
    int range;
    public void acceptData() {
        Scanner sc = new Scanner (System.in);
        //System.out.print("Enter Range:");
        //range= sc.nextInt();
        range =11;
    }
    public void evenForLoop() {
        int even=0;
        for(int i = 2; i<= range;i=i+2) {
            even = i;
            System.out.print(even +" ");
        }
        
    }
    public void evenNestedIf() {
        int num =range;
        for(int i = num;i>0;--i) {
            if(num%2 == 0) {
                System.out.print(num + " ");
                
            }
            num--;
        }
        
        
        
    }
    public void evenWhile() {
        while(range>0) {
            if(range%2 == 0) {
                System.out.print(range + " ");          
            }
            range--;
        }
    }
    
    public static void main(String [] args) {
        Evennumber a = new Evennumber();
        a.acceptData();
       // a.evenForLoop();
        //a.evenNestedIf();
        //a.evenWhile();
        
    }

}
