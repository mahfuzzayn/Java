package cse107;

public class Main {
	public static void main(String[] args) {
		// Problem 1
		StudentInformation student1 = new StudentInformation();
		
		student1.name = "Mahfuz Zayn";
		student1.id = 48005;
		student1.department = "CSE";
		
		student1.displayInfo();
		
		StudentInformation student2 = new StudentInformation();
		
		student2.name = "Junaied Ahmed Habib";
		student2.id = 48027;
		student2.department = "CSE";
		
		student2.displayInfo();
		
		
		// Problem 2
		CircleAreaCalculation circleArea1 = new CircleAreaCalculation();
		
		circleArea1.radius = 10.00;
		
		circleArea1.calculateArea();
		
		CircleAreaCalculation circleArea2 = new CircleAreaCalculation();
		
		circleArea2.radius = 15.80;
		
		circleArea2.calculateArea();
		
		
		// Problem 3
		TemperatureConverter tmp1 = new TemperatureConverter();

		tmp1.toCelcius(32.00);
		tmp1.toFahrenheit(32.00);
		
		TemperatureConverter tmp2 = new TemperatureConverter();
		
		tmp2.toCelcius(64.00);
		tmp2.toFahrenheit(0.00);
		
		
		// Problem 4
		SimpleInterestCalculator int1 = new SimpleInterestCalculator();
		
		int1.principal = 10000.00;
		int1.rate = 10.00;
		int1.time = 5;
		
		int1.calculate();
	}
}
