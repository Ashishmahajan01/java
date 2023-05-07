package JavaLabDay13;

public class StringBasic {

    public static void str() {
        /*
         * Here we have 2 variable a, b
         * both have "Ashish" as object in them
         * here a,b is referring to same string "Ashish" in pool section
         * in heap memory.
         * 
         * 
         * 
         * == is used to check weather the 2 reference are referring to same object
         * or not.
         */

        String a = "Ashish";
        String b = "Ashish";

        if (a == b) {
            System.out.println("True");
        } else
            System.out.println("False");

    }

    public static void str1() {
        /*
         * here we have created two different object for reference c and d
         * so the "Ashish" string will get store outside the pool
         * in heap memory.
         * And two separate copy are get created for c ad d
         * 
         * when we will do c==d it will through false
         * because c and d are referring to separate object in memory
         * 
         */
        String c = new String("Ashish");

        String d = new String("Ashish");

        if (c == d) {
            System.out.println("True");
        } else
            System.out.println("False");

    }

    public static void str2() {
        /*
         * when we just need to check value not what object it is referring
         * then we use equals method
         * 
         */
        String a = "Ashish";
        String b = "Ashish";
        System.out.println(a.equals(b));

        String c = new String("Ashish");
        String d = new String("Ashish");
        System.out.println(c.equals(d));
        
        /*here for both a,b and c,d it will give true because equals method 
        just compare both string, it will not compare weather it is referring to 
        same object or not */

    }

    public static void main(String[] args) {
        str();
        str1();
        str2();

    }

}
