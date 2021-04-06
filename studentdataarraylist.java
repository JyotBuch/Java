
import java.util.ArrayList;
import java.util.Scanner;

class customArray {
	static int n;

	static Scanner sc = new Scanner(System.in);

	class Data {
		int roll;
		String name;
		int age;
		long phone;

		Data(int roll, String name, int age, long phone) {
			this.roll = roll;
			this.name = name;
			this.age = age;
			this.phone = phone;
		}
	}

	public static void main(String args[]) {
		System.out.println("How many students do you want to enter?");
		n = sc.nextInt();
		int roll[] = new int[n];
		String name[] = new String[n];
		int age[] = new int[n];
		long phone[] = new long[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Roll Number");
			roll[i] = sc.nextInt();
			System.out.println("Enter Name");
			name[i] = sc.next();
			System.out.println("Enter Age");
			age[i] = sc.nextInt();
			System.out.println("Enter Phone Number");
			phone[i] = sc.nextLong();
		}

		customArray custom = new customArray();
		custom.addValues(roll, name, age, phone);
	}

	public void addValues(int roll[], String name[], int marks[], long phone[]) {
		ArrayList<Data> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(new Data(roll[i], name[i], marks[i], phone[i]));
		}
		performOperation(list);
	}

	private void performOperation(ArrayList<Data> list) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(
					"\nPress 1 to display all studetnts\nPress 2 to display a selected student\nPress 3 to delete a student");
			int choice = sc.nextInt();
			if (choice == 1)
				printValues(list);
			else if (choice == 2)
				displayStudent(list);
			else if (choice == 3)
				deleteStudent(list);
			else
				System.exit(1);
		}
	}

	private void deleteStudent(ArrayList<Data> list) {
		// TODO Auto-generated method stub
		System.out.println("Enter students Roll number");
		int rollno = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Data data = list.get(i);
			if (data.roll == rollno) {
				System.out.println("Deleted Student :" + data.name);
				list.remove(i);
				n--;
			} else
				continue;
		}

	}

	private void displayStudent(ArrayList<Data> list) {
		// TODO Auto-generated method stub
		System.out.println("Enter students Roll number");
		int rollno = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Data data = list.get(i);
			if (data.roll == rollno)
				System.out.println(data.roll + "\t" + data.name + "\t" + data.age + "\t" + data.phone);
			else
				continue;
		}
	}

	public void printValues(ArrayList<Data> list) {
		for (int i = 0; i < n; i++) {
			Data data = list.get(i);

			System.out.println(data.roll + "\t" + data.name + "\t" + data.age + "\t" + data.phone);
		}
	}
}
