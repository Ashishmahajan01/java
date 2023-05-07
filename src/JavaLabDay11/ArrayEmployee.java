package JavaLabDay11;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEmployee {
    int empid;
    float sal;
    String firstName;
    String lastName;
    static int count = 0;
    Scanner sc = new Scanner(System.in);

    public ArrayEmployee() {
        count++;
        empid = count;

    }

    public ArrayEmployee(int empid, String firstName, String lastName, float sal) {
        this.empid = empid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sal = sal;

    }

    public void createAccount(ArrayEmployee a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter first name: ");
            String fn = sc.next();
            System.out.println("Enter Last name: ");
            String ln = sc.next();
            sc.nextLine();
            System.out.println("Entr Salary");
            float salary = sc.nextFloat();
            a[i] = new ArrayEmployee(empid, fn, ln, salary);
            count++;
            empid = count;
        }

    }

    public String toString() {
        return "\nAccount:\nEmployee id=" + empid + "\nFirst Name= " + firstName + "\nLastName =" + lastName
                + "\nSalary= " + sal + "";
    }

    public void displayEmployee(ArrayEmployee a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].toString());
        }
    }

    public void sortOnSal(ArrayEmployee[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].sal > arr[j].sal) {
                    float temp = arr[i].sal;
                    int temp1 = arr[i].empid;
                    String temp2 = arr[i].firstName;
                    String temp3 = arr[i].lastName;

                    arr[i].sal = arr[j].sal;
                    arr[i].empid = arr[j].empid;
                    arr[i].firstName = arr[j].firstName;
                    arr[i].lastName = arr[j].lastName;

                    arr[j].sal = temp;
                    arr[j].empid = temp1;
                    arr[j].firstName = temp2;
                    arr[j].lastName = temp3;
                }

            }
        }

    }

    public void sortOnFirstName(ArrayEmployee[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].firstName.compareTo(arr[j].firstName) > 0) {
                    float temp = arr[i].sal;
                    int temp1 = arr[i].empid;
                    String temp2 = arr[i].firstName;
                    String temp3 = arr[i].lastName;

                    arr[i].sal = arr[j].sal;
                    arr[i].empid = arr[j].empid;
                    arr[i].firstName = arr[j].firstName;
                    arr[i].lastName = arr[j].lastName;

                    arr[j].sal = temp;
                    arr[j].empid = temp1;
                    arr[j].firstName = temp2;
                    arr[j].lastName = temp3;
                }

            }
        }

    }

    public void sortOnLastName(ArrayEmployee[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].lastName.compareTo(arr[j].lastName) > 0) {
                    float temp = arr[i].sal;
                    int temp1 = arr[i].empid;
                    String temp2 = arr[i].firstName;
                    String temp3 = arr[i].lastName;

                    arr[i].sal = arr[j].sal;
                    arr[i].empid = arr[j].empid;
                    arr[i].firstName = arr[j].firstName;
                    arr[i].lastName = arr[j].lastName;

                    arr[j].sal = temp;
                    arr[j].empid = temp1;
                    arr[j].firstName = temp2;
                    arr[j].lastName = temp3;
                }

            }
        }

    }

    public ArrayEmployee[] sortOnEmpid(ArrayEmployee[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].empid > arr[j].empid) {
                    float temp = arr[i].sal;
                    int temp1 = arr[i].empid;
                    String temp2 = arr[i].firstName;
                    String temp3 = arr[i].lastName;

                    arr[i].sal = arr[j].sal;
                    arr[i].empid = arr[j].empid;
                    arr[i].firstName = arr[j].firstName;
                    arr[i].lastName = arr[j].lastName;

                    arr[j].sal = temp;
                    arr[j].empid = temp1;
                    arr[j].firstName = temp2;
                    arr[j].lastName = temp3;
                }

            }
        }

        return arr;
    }

    public void deleteEmployee(ArrayEmployee[] arr) {
        ArrayEmployee a = new ArrayEmployee();
        //arr = a.sortOnEmpid(arr);
        //a.displayEmployee(arr);
        System.out.print("\n\n\tEnter id:");
        int temp = sc.nextInt();

        arr[temp - 1].sal = 0;
        arr[temp - 1].empid = 0;
        arr[temp - 1].firstName = "";
        arr[temp - 1].lastName = "";
        a.displayEmployee(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].empid > arr[j].empid) {
                    float temp0 = arr[i].sal;
                    int temp1 = arr[i].empid;
                    String temp2 = arr[i].firstName;
                    String temp3 = arr[i].lastName;

                    arr[i].sal = arr[j].sal;
                    arr[i].empid = arr[j].empid;
                    arr[i].firstName = arr[j].firstName;
                    arr[i].lastName = arr[j].lastName;

                    arr[j].sal = temp;
                    arr[j].empid = temp1;
                    arr[j].firstName = temp2;
                    arr[j].lastName = temp3;
                }

            }
        }
    }

    public static void main(String[] args) {
        ArrayEmployee a = new ArrayEmployee();
        ArrayEmployee arr[] = new ArrayEmployee[4];
       
       a.createAccount(arr);
       // a.displayEmployee(arr);
       // a.sortOnSal(arr);
       // a.displayEmployee(arr);
       //a.sortOnFirstName(arr);
       //a.displayEmployee(arr);
      // a.sortOnLastName(arr);
        //a.deleteEmployee(arr);
        a.displayEmployee(arr);

    }

}
