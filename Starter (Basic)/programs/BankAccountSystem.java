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
		
		name = scanf.nextLine();
		accountNumber = 101;
		balance = scanf.nextDouble();
		
		while (true) {
			System.out.println("1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Exit");
			
			int option = scanf.nextInt();
			
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
		}
		
		scanf.close();
	}
}
