package ExceptionHandling1;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidTypeException extends Exception {
	InvalidTypeException(String s) {
		super(s);
	}
}

class InvalidChoiceException extends Exception {
	InvalidChoiceException(String s) {
		super(s);
	}
}

public class handler {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		String name = "";
		while (name.equalsIgnoreCase("")) {
			System.out.println("Enter Item Name: ");
			name = sc.nextLine();
			if (name.isEmpty()) {
				name = sc.nextLine();
			}
		}

		Double price = 0d;
		Integer quantity = 0;
		do {
			try {
				System.out.println("Enter Item Price: ");
				price = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Input valid Price\n");
			}
			sc.nextLine();
		} while (price <= 0);

		do {
			try {
				System.out.println("Enter Product Quantity: ");
				quantity = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("Input valid Quantity\n");
			}
			sc.nextLine();
		} while (quantity <= 0);
		
		System.out.println(name+"\t"+quantity+"\tRs."+quantity*price);
	}
}
