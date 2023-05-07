package JavaLabDay5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasic {

    public static void main(String[] args) {
        // syntax
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        //.....................................<here>
        //......................................u can declare data type but not mandatory
         //to add element
        list.add(67);
        list.add(45);
        list.add(33);
        list.add(7);
        list.add(87);
        list.add(1);
        list.add(74);
        System.out.println(list);
        System.out.println(list.contains(74));
        list.set(0, 99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        
        //or to add element using for loop
       /* for(int i =0;i<5;i++) {
            list.add(sc.nextInt());
            
        }
        
         //for output using for
        
         for(int  i =o;i<5;i++){
             System.out.println(list.get(i));
         }

            */
   
    
//for 2d Arraylist syntax
/*        
     ArrayList<ArrayList<Integer>> lis =new ArrayList<>();
     
     
     //initialization
     for(int j=0;j<3;j++) {
         lis.add(new ArrayList<>());
     }
     
     //add elements
     for(int i=0;i<3;i++) {
         lis.get(i).add(sc.nextInt());
     }
     
*/     
    
    
    }  

}
