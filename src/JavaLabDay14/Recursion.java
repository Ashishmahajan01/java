package JavaLabDay14;

public class Recursion {
    static void print1(int n) {
        System.out.println(n);
        print2(n);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(n);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(n);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(n);
    }

    static void print5(int n) {
        System.out.println(n);
        
    }


    public static void main(String[] args) {
       print1(5);

    }

}
