package Core_java;

import java.util.Scanner;

public class TestFriend {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1.Add new Person\n2.Search by id\n3.Search by name");
			System.out.println("4.Display all Friends\n5.Display by birth month\n6.Search by Email");
			System.out.println("7.Search by Address\n8.Exit\nEnter Choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				FriendData.addnewPerson();
				break;
			case 2:
				System.out.println("Enter Id");
				int pid = sc.nextInt();
				Friend p = FriendData.searchById(pid);
				if (p != null) {
					System.out.println(p);
				} else {
					System.out.println("Not found");
				}
				break;
			case 3:
				System.out.println("Enter name");
				sc.nextLine();
				String nm = sc.nextLine();
				int cnt = FriendData.searchByName(nm);
				// check whether found data
				if (cnt != 0) {
					System.out.println(cnt + "Number of person with name " + nm);
				} else {
					System.out.println("not found");
				}
				break;
			case 4:
				FriendData.displayAll();
				break;
			case 5:
				System.out.println("Enter month for searching");
				int month = sc.nextInt();
				cnt = FriendData.searchByMonth(month);
				if (cnt != 0) {
					System.out.println(cnt + "Number of person has bday in month" + month);
				} else {
					System.out.println("not found");
				}
				break;
			case 6:
				System.out.println("Enter Email");
				sc.nextLine();
				String email = sc.nextLine();
				int count = FriendData.searchByName(email);
				// check whether found data
				if (count != 0) {
					System.out.println(count + "Number of person with Email" + email);
				} else {
					System.out.println("Not found");
				}
				break;

			case 7:
				System.out.println("Enter Address");
				sc.nextLine();
				String address = sc.nextLine();
				int cnnt = FriendData.searchByName(address);
				// check whether found data
				if (cnnt != 0) {
					System.out.println(cnnt + "Number of person with Address" + address);
				} else {
					System.out.println("Not found");
				}
				break;

			case 8:
				sc.close();
				// System.exit(0);
				System.out.println("Thank you for visiting.....");
				break;

			default:
				System.out.println("Wrong choice");
			}

		} while (choice != 8);
	}

}
