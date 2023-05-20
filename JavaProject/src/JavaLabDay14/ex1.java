package JavaLabDay14;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
       /* int [][]arr= {{1,3},
                      {2,6},
                      {8,10},
                      {15,18} };
        int row=0;
        int column =0;
        for(int i=0 ;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][arr[i].length-1] >= arr[i+1][i+1]) {
                    arr[i][arr[i].length-1]=arr[i+1][i+2];
                    arr[i+1][i+1]=0;
                    arr[i+1][i+2]=0;
                    row++;
                    
                }
            }
        }
        int []nums= {-1,10,6,7,-7,1};
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max ){
                max=nums[i];
                System.out.println(max);
            }
        }
        5
140
82
89
134
90
110
112
106
88
90

       
   }*/
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]= new int[len*2];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int resarr[]=new int [len];
        int max=0;
        int count=0;
        for(int i =0,j=1,k=0;i<arr.length;i++,i++,j++,j++,k++){
            resarr[k]=Math.abs(arr[i]-arr[j]);
            if(resarr[k]>max){
                max=resarr[k];
                count=k;
            }
        }
        //[140,82,89,134,90,110,112,106,88,90]
       // [0  ,1 ,2 , 3, 4, 5,  6 , 7 , 8, 9]
        if(arr[count*2 ]>arr[count*2 + 1]) {
            count=1;
        }
        else {
            count=2;
        }
        System.out.print(count + " " +max);
        
        
       }
          
 }

