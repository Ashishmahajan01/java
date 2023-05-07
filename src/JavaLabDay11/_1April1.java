package JavaLabDay11;

import java.util.Arrays;

public class _1April1 {

    public void insertDataWIndex(int arr[], int pos, int elm) {
        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = elm;
        System.out.println(Arrays.toString(arr));

    }

    public static void deleteElement(int [] arr, int pos) {
        arr[pos]=0;
        for(int i=pos;i<arr.length-1;i++) {
            if(arr [i] < arr[i+1]) {
                int temp =arr[i];
                arr[i] =arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public void sortArrayAscending(int arr[]) {
        for(int i = 0 ; i <arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j] ) {
                    int temp =arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
                
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public void sortArrayDescending(int []arr) {
        Arrays.sort(arr);
        for(int i = arr.length-1,j=0;i>arr.length/2;i--,j++) {
            int temp =arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    public void sortArrayAnD(int []arr) {
        Arrays.sort(arr);
        System.out.println("Array in ascending sort:");
        System.out.println(Arrays.toString(arr));
        for(int i = arr.length-1,j=0;i>arr.length/2;i--,j++) {
            int temp =arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
        }
        System.out.println("Array in descending sort:");
        System.out.println(Arrays.toString(arr));

    }

    

    public static void main(String[] args) {
        _1April1 a = new _1April1();
        int arr[] = { 2, 12, 1, 7, 5};
        System.out.println(Arrays.toString(arr));
        //a.insertDataWIndex(arr, 3, 12);
        //a.deleteElement(arr,1);
        //a.sortArrayAscending(arr);
        //a.sortArrayDescending(arr);
        a.sortArrayAnD(arr);
        }

    }


