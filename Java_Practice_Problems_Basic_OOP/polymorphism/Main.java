package polymorphism;

// Problem 1
class Animal {
	void sound() {
		System.out.println("Some sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Bark");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Meow");
	}
}

public class Main {
	public static void main(String[] args) {
		// Problem 1
		Animal a;
		
		a = new Dog();
		a.sound();
		
		a = new Cat();
		a.sound();
	}
}
