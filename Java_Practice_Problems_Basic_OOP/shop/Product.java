package shop;

public class Product {
	String name;
	int quantity, price;
	
	void showDetails() {
		System.out.print("Product name: " + name + "\n" + "Quantity: " + quantity + " pcs\n" + "Price: " + price + "tk\n\n");
	}
}
