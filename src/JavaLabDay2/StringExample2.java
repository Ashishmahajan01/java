package JavaLabDay2;

import java.util.Scanner;

public class StringExample2 {
    public static void main(String [] args) {
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String result = personname(name);
        System.out.println(result);
        
    }
    static String personname(String name) {
        String name1 = "Hello " + name;
        return name1;
    }

}
