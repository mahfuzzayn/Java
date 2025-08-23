/*

Programmed by: Mahfuz Zayn
Date created: 23 August, 2025
Last updated: 23 August, 2025

Description
A simple ATM Money withdraw system. Takes balance, withdrawl attempts and each withdrawl amount. Program will
verify each withdrawl amount after input and return sucess, warning or error messages. After successful withdrawl
the last balance will be shown.

*/

package programs;
import java.util.Scanner;

public class ATMWithdrawlSystem {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter your balance: ");
		double balance = input.nextDouble();
		
		System.out.printf("Enter total withdrawal attempts: ");
		int attempts = input.nextInt();
		
		for (int i = 0; i < attempts; i++) {
			System.out.printf("Enter Withdrawl No.%d amount: ", i + 1);
			double withdrawl_amount = input.nextDouble();
			
			if (withdrawl_amount > balance) {
				System.out.printf("Insufficient funds\n");
				continue;
			}
			
			if (withdrawl_amount % 5 == 0 && withdrawl_amount <= balance) {
				balance -= withdrawl_amount;
				
				System.out.printf("Withdrawl successful, remaining balance: %.0f\n", balance);
			} else {
				System.out.printf("Invalid request\n");
			}
		}
		
		input.close();
	}
}
