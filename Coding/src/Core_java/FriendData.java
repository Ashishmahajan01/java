package Core_java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FriendData {
	private static Friend[] frnd;
	private static int count;

	static {
		frnd = new Friend[10];
		frnd[0] = new Friend(12, "Purshya", "33333", "purshya@gamil.com", "pune", new Date());
		frnd[1] = new Friend(13, "Ashish", "4444", "ashish@gmail.com", "jalgaon", new Date());
		frnd[2] = new Friend(14, "Akash", "5555", "akash@yahoo.com", "Mumbai", new Date());
		count = 3;
	}

	public static void addnewPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter mobile");
		String mobile = sc.next();
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter Address");
		String address = sc.next();
		System.out.println("Enter bdate(dd/mm/yyyy)");
		String bdate = sc.next();
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
		Date dt = null;
		try {
			dt = sdt.parse(bdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		frnd[count] = new Friend(id, name, mobile, email, address, dt);
		count++;

	}

	// display logic
	public static void displayAll() {
		for (int i = 0; i < count; i++) {
			System.out.println(frnd[i]);
		}
	}

	public static Friend searchById(int id) {
		for (int i = 0; i < count; i++) {
			if (frnd[i].getId() == id) {
				return frnd[i];
			}
		}
		return null;
	}

	public static int searchByName(String nm) {
		int cnt1 = 0;
		for (int i = 0; i < count; i++) {
			if (frnd[i].getName().equals(nm)) {
				System.out.println(frnd[i]);
				cnt1++;
			}
		}

		return cnt1;
	}

	public static int searchByMonth(int month) {
		int cnt1 = 0;
		for (int i = 0; i < count; i++) {
			int m = frnd[i].getDate().getMonth();
			if (m == month) {
				System.out.println(frnd[i]);
				cnt1++;
			}
		}
		return cnt1;
	}

	public static int searchByAddress(String add) {
		int cnt1 = 0;
		for (int i = 0; i < count; i++) {
			if (frnd[i].getAddress().equals(add)) {
				System.out.println(frnd[i]);
				cnt1++;
			}
		}

		return cnt1;
	}

	public static int searchByEmail(String email) {
		int cnt1 = 0;
		for (int i = 0; i < count; i++) {
			if (frnd[i].getEmail().equals(email)) {
				System.out.println(frnd[i]);
				cnt1++;
			}
		}

		return cnt1;
	}
}
