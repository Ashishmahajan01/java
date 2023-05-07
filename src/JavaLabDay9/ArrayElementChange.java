package JavaLabDay9;

import java.util.Arrays;
import java.util.Scanner;

/*
 * [1,2,3,4,5]
 * d=4
 * [2,3,4,5,1]
 * [3,4,5,1,2]
 * [4,5,1,2,3]
 * [5,1,2,3,4]
 */

public class ArrayElementChange {
    int d;
    int n;

    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Enter Rotation no: ");
        d = sc.nextInt();
        System.out.print("Enter Array element count: ");
        n = sc.nextInt();
        System.out.println("Enter Array element: ");

    }

    public void arrayLogic() {
        int arr[] = new int[n];
        int arrtemp[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        if (d != n) {
            for (int i = n - 1, k = 0; i < arr.length; i++, k++) {
                arrtemp[k] = arr[i];
                count++;
            }
           // System.out.println(Arrays.toString(arrtemp));
            for (int i = 0, k = count; i < n - 1; i++, k++) {
                arrtemp[k] = arr[i];
            }
            
            System.out.println(Arrays.toString(arrtemp));

        }
        
        
        
        else {
            System.out.println(Arrays.toString(arr));

        }
        

    }

    public static void main(String[] args) {
        ArrayElementChange a = new ArrayElementChange();
        a.input();
        a.arrayLogic();

    }

}
