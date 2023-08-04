package MCQ;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

public class Class1 {
    
    public static void main(String[] args) {
        ArrayDeque<Integer> deque =
                new ArrayDeque<Integer>();
          deque.push(1);
          deque.push(2);
          deque.push(3);
          deque.poll();
          System.out.println(deque);
          
          ArrayList <String> al = new ArrayList<>();
          al.add("x");
          al.add("y");
          al.add("z");
          al.add(1,"B");
          System.out.println(al);
          
    
          
          HashMap<Integer,String> hmap =new HashMap<>();
          hmap.put(1, "Ashish");
          System.out.println(hmap);
          
    }

}
