/*

Programmed by: Mahfuz Zayn
Date created: 21 August, 2025
Last updated: 21 August, 2025

Description
A simple passed & failed student validation program using condition. First it takes total student numbers. Then
student marks has been taken. After the validation it prints how many student passed & failed.
 
*/

package programs;
import java.util.Scanner;

public class PassFailValidator {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter total students number: ");
		int total_students = input.nextInt();
		double[] student_marks = new double[total_students];
		int passed = 0, failed = 0;
		
		System.out.println("Enter each student number serially with a gap between them.");
		for (int i = 0; i < total_students; i++) { 
			student_marks[i] = input.nextDouble();
		}
		
		for (int i = 0; i < total_students; i++) {
			if (student_marks[i] >= 40) {
				passed++;
			} else {
				failed++;
			}
		}
		
		System.out.println("Total student passed: " + passed + ", failed: " + failed);
		
		input.close();
	}
}
