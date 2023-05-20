package JavaLabDay4;

public class LsProblem1 {

    public static void main(String[] args) {
       int[] arr = {1,232,453,542,5324,6545,12,234,59};
       int loopans=loop(arr);
       int logicans = logic(loopans);
       int ans =logicans;
       System.out.println(ans);

    }
    static int loop( int [] arr) {
        for(int i = 0;i<arr.length;i++) {
            int element = arr[i];
            return element;
        }
        return 0;
    }
    static int logic(int element) {
        int count = 0;
        while(element > 0) {
            element = element/10;
            count++;
            return count;
        }
        return 0;
    }

}
