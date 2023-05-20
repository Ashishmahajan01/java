package JavaLabDay2;

import java.util.Scanner;

public class StringExample {
    public static void main(String [] args) {
        
        String result = name();
        System.out.println("Name: "+result);
        
    }
    
    static String name() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name:");
        String name =sc.nextLine();
        return name;
        
    }

}
