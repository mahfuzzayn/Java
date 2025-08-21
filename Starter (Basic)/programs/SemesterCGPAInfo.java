/*

Programmed by: Mahfuz Zayn
Date created: 21 August, 2025
Last updated: 21 August, 2025

Description
A Simple CGPA calculator that takes desired CGPA initially. Then takes total courses number and respectively
each course grade point & credit hour serially. After than it calculates total CGPA and prints nicely did the user
got his desired CPGA or not.

*/

package programs;
import java.util.Scanner;

public class SemesterCGPAInfo {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your desired CGPA: ");
		double desired_cgpa = input.nextDouble();
		
		System.out.println("Enter total courses number: ");
		int total_courses = input.nextInt();
		double total_points = 0;
		double total_credits = 0;
		double cgpa = 0;
		
		System.out.println("Enter each course grade point & credit hour and also maintain gap between them.");
		for (int i = 0; i < total_courses; i++) {
			double grade_point = input.nextDouble();
			double credit_hour = input.nextDouble();
			
			total_points += grade_point * credit_hour;
			total_credits += credit_hour;
		}
		
		cgpa = total_points / total_credits;
		
		System.out.printf("Your CGPA is: %.2f\n", cgpa);
		
		if (cgpa >= desired_cgpa) {
			System.out.printf("Yeah you did it! You got higher CGPA than your desired CGPA %.2f", desired_cgpa);
		} else {
			System.out.printf("Oh no! You got less CGPA than your desired CGPA %.2f", desired_cgpa);
		}
		
		input.close();
	}
}
