package programs;
import java.util.Scanner;

public class DigitFrequencyChecker {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int digit = input.nextInt();
		int[] frequency = new int[10];

		while (digit != 0) {
			int d = digit % 10;
			frequency[d]++;
			digit /= 10;
		}

		System.out.println("\nDigit frequencies:");
		for (int i = 0; i < frequency.length; i++) {
			System.out.println("Digit " + i + " → " + frequency[i] + " times");
		}
		
		input.close();
	}
}
