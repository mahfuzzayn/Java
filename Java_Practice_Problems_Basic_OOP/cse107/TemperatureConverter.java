package cse107;

public class TemperatureConverter {
	Double celcius;
	Double fahrenheit;
	
	void toCelcius(Double fahrenheit) {
		this.fahrenheit = fahrenheit;
		fahrenheit =  (fahrenheit - 32) * 5/9;
		System.out.println(fahrenheit);
	}
	
	void toFahrenheit(Double celcius) {
		this.celcius = celcius;
		celcius = celcius * 9/5 + 32;
		System.out.println(celcius);
	}
} 
