package exercise;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Number num1 = new Number();
		
		Double largestNumber = num1.getLargestNumber(10.00, 20.00, 30.00);
		
		System.out.println(largestNumber);
		
		
	}
}
