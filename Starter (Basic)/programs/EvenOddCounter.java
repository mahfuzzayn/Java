package programs;
import java.util.Scanner;

public class EvenOddCounter {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] arr = new int[n];
		int oddNums = 0;
		int evenNums = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
			
			if (arr[i] % 2 == 0) {
				oddNums++;
			} else {
				evenNums++;
			}
		}
		
		System.out.println("Even count: " + evenNums);
		System.out.println("Odd count: " + oddNums);
		
		input.close();
	}
}