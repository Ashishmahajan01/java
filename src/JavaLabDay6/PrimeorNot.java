package JavaLabDay6;

import java.util.Scanner;

public class PrimeorNot {
    int n, count = 0;
    
    public void acceptData() {
        System.out.println("Enter Nth number: ");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();     
    }
    public void PrimeLogic() {
        
    }
    
    public static void main(String []args) {
        PrimeorNot a = new PrimeorNot();
        a.acceptData();
        a.PrimeLogic();
    
  }
}

