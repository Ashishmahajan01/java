package JavaLabDay6;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNumber {
    int [] arr;
    public void acceptData() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter input count:");
        int num = sc.nextInt();
        arr= new int[num];
        for(int i = 0; i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
    }
    public void addForLoop() {
        int sum =0;
        for(int i = 0; i<arr.length;i++) {
            sum +=  arr[i];
        }
        System.out.println("Sum = " + sum);
        
    }
    public void addWhileLopp() {
        int a =(arr.length-1);
        int sum=0;
        while(a>=0) {
            sum += arr[a];
            a--;
        }
        System.out.println("Sum = " + sum);
    }
    public void addForEachloop() {
        int sum = 0;
        for(int s: arr) {
            sum += arr[s-1];
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        SumOfNumber a = new SumOfNumber();
        a.acceptData();
        //a.addForLoop();
       // a.addWhileLopp();
        a.addForEachloop();



    }

}
