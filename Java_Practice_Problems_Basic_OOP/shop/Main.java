package shop;

public class Main {
	public static void main(String[] args) {
		// Problem 5
		Product product1 = new Product();
			
		product1.name = "Hablu Programmer";
		product1.quantity = 5;
		product1.price = 120;
		
		product1.showDetails();
		
		Product product2 = new Product();
		
		product2.name = "Happiness";
		product2.quantity = 16;
		product2.price = 990;
		
		product2.showDetails();
	}
}
