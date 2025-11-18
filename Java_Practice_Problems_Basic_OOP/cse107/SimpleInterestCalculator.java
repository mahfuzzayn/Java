package cse107;

public class SimpleInterestCalculator {
	Double principal, rate, interest;
	int time;
	
	void calculate() {
		interest = (principal * rate * time) / 100;
		System.out.println(interest);
	}
}
