package JavaLabDay14;

import java.util.Arrays;

public class Sagar {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6,1 };
        int[] b = { 1, 1, 1, 1, 1, 1, 1 };
        int i=0;
        int c[] = new int[b.length];
        iloop(i,a,b,c);
        System.out.println(Arrays.toString(iloop(i,a,b,c)));
        

    }

    
    public static int [] iloop(int i, int[] a, int[] b,int c[]) 
    {
        if(i<b.length)
        {
            c[i]=a[i]+b[i];
             i++;
             System.out.println(Arrays.toString(c));
             iloop(i,a,b,c);
             System.out.println(Arrays.toString(c));    
        }
        return c;
        
       
      
    }
}