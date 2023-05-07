package JavaLabDay10;

import java.util.Scanner;

public class TechNumber {
/*
 * [2025]
 * 20  25
 * 20+25=45
 * (45)*(45) = 2025
 * so input == 2025
 * 
 */
    Scanner sc = new Scanner(System.in);
    public void logic() {
        System.out.print("Enter Number :");
       
        String num = sc.nextLine();
        if (num.length() % 2 != 0) {
            System.out.print("Please enter valid number: ");
        }
        int camp = Integer.parseInt(num);
        char arr[] = new char[num.length()];

        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i);
            //System.out.println(arr[i]);
        }
        int temp = num.length() / 2;
        String local = "";
        for (int i = 0; i < temp; i++) {
            local += arr[i];
        }
        String local2 = "";
        for (int i = temp; i < num.length(); i++) {
            local2 += arr[i];
        }

        int num1 = Integer.parseInt(local);
        int num2 = Integer.parseInt(local2);

        int result = (num1 + num2) * (num1 + num2);
        if (camp == result) {
            System.out.println("The number " + camp + " is Tech number: ");
        } else {
            System.out.println("The number is not Tech number: ");
        }

    }
        
    

    public static void main(String[] args) {
        TechNumber a = new TechNumber();
        a.logic();

    }

}
