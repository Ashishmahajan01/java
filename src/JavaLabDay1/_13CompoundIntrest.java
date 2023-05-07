package JavaLabDay1;

import java.util.Scanner;

public class _13CompoundIntrest {
    double p,r,n,t,a;
    public void setNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Intrest:");
        p = sc.nextDouble();
        System.out.println("Enter Intrest Rate:");
        r = sc.nextDouble();
        System.out.println("Enter Number of Times intrest applied Per time period: ");
        n = sc.nextDouble();
        System.out.println("Enter Time periods elapsed:");
        t = sc.nextDouble();
    }
    public void setIntrestLogic(){
        double x = 1+(r/n);
        double y = p*x;
        double z = n*t;
        a = Math.pow(y, z);
        System.out.println("Compound Intrest = " + a );
    }
    public static void main(String [] args){
        _13CompoundIntrest a = new _13CompoundIntrest();
        a.setNumber();
        a.setIntrestLogic();
    }
}


