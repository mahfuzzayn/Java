/*

Programmed by: Mahfuz Zayn
Date created: 21 August, 2025
Last updated: 21 August, 2025

Description
A simple calculator that takes an input of how many operands users want to work with. Then user
inputs those numbers and again another input will be taken as operator for doing operations.

Limitations: This calculator can only work with single operator (input).
 
*/

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