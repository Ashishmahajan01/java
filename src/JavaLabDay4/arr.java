package JavaLabDay4;

import java.io.FileOutputStream;
import java.util.Arrays;

class arr {

    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;

    void m1(char ch, String str) {
        System.out.println(ch);
        System.out.println(str);
    }

    void m2(int a, double d, boolean b) {
        System.out.println(a);
        System.out.println(d);
        System.out.println(b);
    }

    static void m3(String str) {
        System.out.println(str);

    }

    static void m4(char ch, char ch1) {
        System.out.println(ch);
        System.out.println(ch1);
    }

    public static void main(String[] args) {
        arr t = new arr();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(c);
        System.out.println(d);
        t.m1('a', "ratan");
        t.m2(100, 10.8, true);
        m3("anu");
        m4('d', 'w');
    }
}