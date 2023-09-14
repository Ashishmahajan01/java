package JavaLabDay14;

import java.util.Arrays;
import java.util.Comparator;

public class AA {

    public static void main(String[] args) {
        int arr[][]={{1,2},{0,1},{1,1}};
        Arrays.sort(arr,Comparator.comparingInt(o->o[0]));
        System.out.println(Arrays.deepToString(arr));
        Arrays.sort(arr,Comparator.comparingInt(o->o[1]));
        System.out.println(Arrays.deepToString(arr));

    }

}
