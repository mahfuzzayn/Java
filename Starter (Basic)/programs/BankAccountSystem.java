package programs;
import java.util.Scanner;

public class BankAccountSystem {
	static double deposit(double balance, double amount) {
		return balance + amount;
	}
	
	static double withdraw(double balance, double amount) {
		if (amount > balance) return balance;
		
		return balance - amount;
	}
	
	static double checkBalance(double balance) {
		return balance;
	}
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		String name;
		int accountNumber;
		
		System.out.println("1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Exit\n");
		
		int option = scanf.nextInt();
		
		while (option != 1) {
			System.out.println("! --- You have to create an account first --- !\n");
			option = scanf.nextInt();
		}
		
		System.out.println("Enter your name: ");
		name = scanf.next();
		
		accountNumber = 20250827;
		
		System.out.println("Initial balance: ");
		double balance = scanf.nextDouble();
		
		System.out.printf("\nWelcome, %s\n", name);
		System.out.printf("Account number %d and balance: %.2f taka\n\n", accountNumber, balance);
		
		while (true) {
			System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit\n");
			
			option = scanf.nextInt();
			
			switch (option) {
				case 1: 	
					System.out.printf("Enter your deposit amount: ");
					double deposit_amount = scanf.nextDouble();
					
					balance = deposit(balance, deposit_amount);
					System.out.printf("Deposit sucessful. Current balance: %.2f taka \n\n", balance);
					
					break;
				case 2: 
					System.out.printf("Enter your withdrawal amount: ");
					double withdrawal_amount = scanf.nextDouble();
					
					balance = withdraw(balance, withdrawal_amount);
					System.out.printf("Withdrawal sucessful. Current balance: %.2f taka \n\n", balance);
					
					break;
				case 3:
					double current_balance = checkBalance(balance);
					System.out.printf("Your current balance: %.2f taka \n", current_balance);
					
					break;
				case 4: 
					break;
			}
			
			if (option == 4) {
				System.out.printf("Exiting Program... Thank you.\n");
				
				break;
			}
		}
		
		scanf.close();
	}
}
