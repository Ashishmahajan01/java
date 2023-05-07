package JavaLabDay7;

import java.util.Scanner;

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

public class Account {
    int accId, pincode, pin;
    String name;
    float balance;
    static float iRate = 6;
    static int count = 0;
    Scanner sc = new Scanner(System.in);
    double int30Days;

    public Account() {
        count += 1;
        accId = count;
    }

    public void acceptData() {
        System.out.print("\n 1.Create Account  \n 2.Display Information of Account \n 3.Deposit \n 4.Withdrwal \n 5.Check Balance  \n 6.change iRate \n 7.calculateIntrest for 30 days \n 8. exit \n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choice: ");
        int inpu = sc.nextInt();
        switch (inpu) {
            case 1:
                createAccount();
                acceptData();
                break;
            case 2:
                displayInfo();
                acceptData();
                break;

            case 3:
                deposite();
                acceptData();
                break;

            case 4:
                withdraw();
                acceptData();
                break;

            case 5:
                checkBalance();
                acceptData();
                break;

            case 6:
                intrestRate();
                acceptData();
                break;

            case 7:
                cal30days();
                acceptData();
                break;

            case 8:
                exit();
                break;

        }

    }

    public void createAccount() {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.println();
        System.out.print("Enter Pin Code: ");
        pincode = sc.nextInt();

    }

    public void displayInfo() {
        System.out.println("\nAccount Id: " + accId + "\nName: " + name + "\nPin Code: " + pincode + "\nBalance: " + balance);

    }

    public void deposite() {
        System.out.print("Enter Amount you want to deposite: ");
        float dep = sc.nextFloat();
        balance += dep;

    }

    public void withdraw() {
        System.out.print("Enter Amount You want to withdraw: ");
        float with = sc.nextFloat();
        while (with > balance) {
            System.out.print("Your Balance is: " + balance + "\nPlease enter correct Withdrawal Amount: ");
            with = sc.nextFloat();
        }

        balance -= with;

    }

    public void checkBalance() {
        System.out.print("Your Balance is: " + balance);

    }

    public static void intrestRate() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Old Intrest Rate is: " + iRate);
        System.out.print("Enter New Intrest Rate: ");
        iRate =sc.nextInt();

    }

    public void cal30days() {
        //balance *intrest rate* 30 days;
        int30Days = (balance * iRate) * (360/30);
        System.out.print("30 Days Intrest = " + int30Days);

    }

    public void exit() {
        System.out.println("ThankYou!!! :)");
        System.exit(0);

    }

    public static void main(String[] args) {
        Account a = new Account();
        System.out.println("**Welcome To Laxmi Chit Fund**");
        a.acceptData();
        

    }

}
