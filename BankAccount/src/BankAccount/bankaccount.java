package BankAccount;

	import java.util.Scanner;

	public class bankaccount {
		public static String user_name;
		private static int balance;
		private static int acc_nos;
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			getData();
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("Press 1 for Deposit");
				System.out.println("Press 2 for Withdrawal");
				System.out.println("Press 3 for Checking Balance");
				System.out.println("Enter your choice: ");
				int x= sc.nextInt();
				switch(x)
				{
					case 1:balance = deposit(balance);
						break;
					case 2:balance = withdraw(balance);
						break;
					case 3:checkbalance(user_name,balance);
						break;
					default: System.out.println("Wrong Choice");
						break;
				}
			}
			
		}
		private static void getData() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name:");
			user_name = sc.nextLine();
			System.out.println("Enter your Account Number:");
			acc_nos = sc.nextInt();
			balance=2500;
			
		}
		private static void checkbalance(String user_name, int balance) {
			// TODO Auto-generated method stub
			System.out.println(user_name+" your balance is "+balance);
		}

		private static int withdraw(int balance) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Withdrawal amount");
			int amount=sc.nextInt();
			if(balance>amount)
				{
					System.out.println("You have withdrawn an amount of "+amount);
					return (balance-amount);
					
				}
			else
				{
					System.out.println("Insufficient balance");
					return balance;
				}
			
			
		}

		private static int deposit(int balance) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Deposit amount");
			int amount=sc.nextInt();
			System.out.println("You have deposited an amount of "+amount);
			return (balance+amount);
		}


}
