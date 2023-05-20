package JavaLabDay10;

import java.util.Scanner;

/*
input 80
80+1;
=81 is perfect square
 */
public class SunnyNumber {
    public void logic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int temp = num + 1;
        int sq =0;
        int count= 0;
        for(int i =0;i<num;i++) {
            sq=i*i;
            if(sq == temp) {
                System.out.println("The number is sunny number:");
                count++;
                break;
            }
            
        }
        if(count ==0) {
            System.out.println("The number is not sunny Number: ");
        }
        
        
        
        
    }

    public static void main(String[] args) {
        SunnyNumber a = new  SunnyNumber();
        a.logic();

    }

}
