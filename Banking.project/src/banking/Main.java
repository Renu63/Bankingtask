package banking;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		operation op = new operation();
		while (true) {

			System.out.println("Welcome to the Simple Banking System!");
			System.out.println("Select option from below ");

			System.out
					.println(" 1.Create Account Number\n 2.Show Account Details\n 3. Balance enqury\n 4.Deposit money");

			int a = sc.nextInt();

			switch (a) {
			case 1:
				op.createacc();
				break;

			case 2:
				op.accountDetails();
				break;

			case 3:
				op.BalanceInfo();
				break;

			case 4:
				op.deposit();
				break;

			default:
				System.out.println("choose correct option");
			}
		}
	}
}