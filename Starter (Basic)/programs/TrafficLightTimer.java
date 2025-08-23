/*

Programmed by: Mahfuz Zayn
Date created: 24 August, 2025
Last updated: 24 August, 2025

Description
A Simple program simulates a traffic light system based on user input.
The user enters the total seconds to run and the duration of Red, Green, and Yellow lights.
For each second, the program prints which light is active (Red, Green, or Yellow) and continues in a repeating cycle until the total time is reached.
The output is a second-by-second log of the traffic light’s color changes.

*/

package programs;
import java.util.Scanner;

public class TrafficLightTimer {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter total seconds (t): ");
		int t = input.nextInt();
		
		System.out.printf("Enter each rgy (Red, Green & Yellow) with a gap between them: ");
		
		int r = input.nextInt();
		int g = input.nextInt();
		int y = input.nextInt();
		
		int total = r + g + y;
		
		for (int i = 0; i < t; i++) {
			int pos = i % total;
			
			String color;

			if (pos < r) {
				color = "Red";
			} else if (pos < r + g) {
				color = "Green";
			} else  {
				color = "Yellow";
			}
				
			System.out.printf("Second %d: %s\n", i + 1, color);
		}
		
		System.out.printf("Simulation complete");
		
		input.close();
	}
}
