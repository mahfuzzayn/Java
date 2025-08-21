package programs;
import java.util.Scanner;

public class Calculator {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many opernads you want work with: ");
		int n = input.nextInt();
		double[] numbers = new double[n];
		
		System.out.println("Enter number serially with a gap between them.");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
		}
		
		System.out.println("Enter operator (+, -, /, *): ");
		char operator = input.next().charAt(0);
		double result = numbers[0];
		
		for (int i = 1; i < n; i++) {
			switch (operator) {
				case '+': 
					result += numbers[i];
					break;
				case '-': 
					result -= numbers[i];
					break;
				case '*': 
					result *= numbers[i];
					break;
				case '/': 
					result /= numbers[i];
					break;	
				default: 
					System.out.println("No operator was found, hence no calculations were made.");
			}
		}
		
		String formatted = String.format("%.3f", result);
		
		System.out.println("Operation sucessful, Result: " + formatted);
		
		input.close();
	}
}