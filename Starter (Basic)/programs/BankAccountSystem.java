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
		double balance;
		
		System.out.println("1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Exit");
		
		int option = scanf.nextInt();
		
		while (option != 1) {
			System.out.println("! --- You have to create an account first --- !\n");
			option = scanf.nextInt();
		}
		
		System.out.println("Enter your name: ");
		name = "Mahfuz Zayn";
		
		accountNumber = 101;
		
		System.out.println("Initial balance: ");
		balance = 500;
		
		System.out.println("\n");
		System.out.printf("Welcome, %s\n", name);
		System.out.printf("Account balance: %f\n\n", balance);
		
		while (true) {
			System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
			
			option = scanf.nextInt();
			
			switch (option) {
				case 2: 	
					double deposit_amount = scanf.nextDouble();
					
					deposit(balance, deposit_amount);
					
					break;
				case 3: 
					double withdrawal_amount = scanf.nextDouble();
					
					withdraw(balance, withdrawal_amount);
					
					break;
				case 4:
					checkBalance(balance);
					break;
				case 5: 
					break;
			}
			
			if (option == 5) {
				break;
			}
		}
		
		scanf.close();
	}
}
