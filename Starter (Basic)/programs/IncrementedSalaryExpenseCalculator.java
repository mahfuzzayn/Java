/*

Programmed by: Mahfuz Zayn
Date created: 21 August, 2025
Last updated: 21 August, 2025

Description
Suppose a company has x numbers of employees and they spend y number of total salary as expense. They want to know
if they increment salary of each employee by t%. What will be the current total salary expense, incremented total salary expense and
the difference between them.

*/

package programs;
import java.util.Scanner;

public class IncrementedSalaryExpenseCalculator {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter total employees number: ");
		int total_employees = input.nextInt();
		double[] current_employees_salary = new double[total_employees];
		double[] incremented_employees_salary = new double[total_employees];
		double total_current_employees_salary = 0;
		double total_incremented_employees_salary = 0;

		System.out.println("Enter each employee salary & increment percentage with a space, between each employee information there should be a gap between them.");
		for (int i = 0; i < total_employees; i++) {
			current_employees_salary[i] = input.nextDouble();
			
			double percentage = input.nextDouble();
			
			incremented_employees_salary[i] = current_employees_salary[i] + current_employees_salary[i] * (percentage / 100);
		} 

		for (int i = 0; i < total_employees; i++) {
			total_current_employees_salary += current_employees_salary[i];
			total_incremented_employees_salary += incremented_employees_salary[i];
		} 

		String total_current_employees_salary_formatted = String.format("%.2f", total_current_employees_salary);
		String total_incremented_employees_salary_formatted = String.format("%.2f", total_incremented_employees_salary);
		String difference = String.format("%.2f", total_incremented_employees_salary - total_current_employees_salary);
		
		System.out.println("Current total employees salary: " + total_current_employees_salary_formatted);
		System.out.println("Incremented total employees salary: " + total_incremented_employees_salary_formatted);
		System.out.println("Difference: " + difference);
		
		input.close();
	}
}
