package JavaLabDay8;

import java.util.Scanner;

import JavaLabDay7.Account;

/*
 * 3) create class Account 
    int accId , pincode , pin 
    String name 
    float balance
    static int iRate
    with following functions
        Display Menu 
            1. Create Account 
            2. Display Information of Account 
            3. Deposit
            4. Withdrwal
            5. check Balance 
            6. change iRate
            7. calculateIntrest for 30 days 
            8. exit
    include all concepts here 
        1) Constructor Overloading 
        2) this , static 
        3) instance /  static methods 
        4)          
 */

public class Account1 {
    int accId, pincode;
    String name;
    float balance;
    static float iRate;
    static int count = 0;
    double int30Days;
    // String [] allInfo = new String[10];
    String[] nameDir = new String[20];
    int[] pinDir = new int[20];
    float[] balanceDir = new float[20];

    Scanner sc = new Scanner(System.in);

    public Account1() {
        count += 1;
        accId = count;
    }

    public void acceptData1() {
        System.out.println(
                "\n 1.Create Account  \n 2.Display Information of Account \n 3.Deposit \n 4.Withdrwal \n 5.Check Balance  \n 6.change iRate \n 7.calculateIntrest for 30 days \n 8. exit \n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choice: ");
        int inpu = sc.nextInt();
       // sc.nextLine();             //this two method to solve the issue.
        //Integer.parseInt(String);
        switch (inpu) {
            case 1:
                createAccount1();
                acceptData1();
                break;
            case 2:
                displayInfo1();
                acceptData1();
                break;

            case 3:
                deposite1();
                acceptData1();
                break;

            case 4:
                withdraw1();
                acceptData1();
                break;

            case 5:
                checkBalance1();
                acceptData1();
                break;

            case 6:
                intrestRate1();
                acceptData1();
                break;

            case 7:
                cal30days1();
                acceptData1();
                break;

            case 8:
                exit1();
                break;

        }

    }

    public void createAccount1() {
       // sc.nextLine();
        
        System.out.print("Enter Name: ");
        //sc.next();
        nameDir[accId] = sc.nextLine();//when you take 2nd person input it skip to take input and go on next line     
        System.out.println();
        System.out.print("Enter Pin Code: ");
        pinDir[accId] = sc.nextInt();
        System.out.println();
        System.out.print("Thankyou For Your Time: \n Your Account Id is : " + accId +"\n" );
        count += 1;
        accId = count;

    }

    public void displayInfo1() {
        System.out.print("Enter Your Account ID: ");
        int temp = sc.nextInt();

        System.out.println("\nAccount Id: " + temp + "\nName: " + nameDir[temp] + "\nPin Code: " + pinDir[temp]
                + "\nBalance: " + balanceDir[temp]);

    }

    public void deposite1() {
        System.out.print("Enter Your Account ID: ");
        int temp = sc.nextInt();
        System.out.print("Enter Amount you want to deposite: ");
        float bal = sc.nextFloat();
        balanceDir[temp] = balanceDir[temp] + bal;
        // balance += dep;

    }

    public void withdraw1() {
        System.out.print("Enter Your Account ID: ");
        int temp = sc.nextInt();
        System.out.print("Enter Amount You want to withdraw: ");
        float with = sc.nextFloat();
        while (with > balanceDir[temp]) {
            System.out.print("Your Balance is: " + balanceDir[temp] + "\nPlease enter correct Withdrawal Amount: ");
            with = sc.nextFloat();
        }
        balanceDir[temp] = balanceDir[temp] - with;

        // balance -= with;

    }

    public void checkBalance1() {
        System.out.print("Enter Your Account ID: ");
        int temp = sc.nextInt();
        System.out.print("Your Balance is: " + balanceDir[temp]);

    }

    public static void intrestRate1() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Old Intrest Rate is: " + iRate);
        System.out.print("Enter New Intrest Rate: ");
        iRate =sc.nextInt();

    }

    public void cal30days1() {
        //balance *intrest rate* 30 days;
        int30Days = (balance * iRate) * (360/30);
        System.out.print("30 Days Intrest = " + int30Days);

    }

    public void exit1() {
        System.out.println("ThankYou!!! :)");
        System.exit(0);

    }

    public static void main(String[] args) {
        Account1 a = new Account1();
        System.out.println("**Welcome To Laxmi Chit Fund**");
        a.acceptData1();

    }

}
