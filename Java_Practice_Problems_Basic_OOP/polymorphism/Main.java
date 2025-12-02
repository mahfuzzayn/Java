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

// Problem 2
class Student {
	void showGrade() {
		System.out.println("No grade");
	}
}

class ScienceStudent extends Student {
	void showGrade() {
		System.out.println("A");
	}
}

class ArtsStudent extends Student {
	void showGrade() {
		System.out.println("B");
	}
}

// Problem 3
class Calculator {
	int add(int a, int b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
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
		
		
		// Problem 2
		Student s;
		
		s = new ScienceStudent();
		s.showGrade();
		
		s = new ArtsStudent();
		s.showGrade();

        // Problem 3
		Calculator c;
		
		c = new Calculator();
		System.out.println(c.add(10, 20));
		
		c = new Calculator();
		System.out.println(c.add(10, 20, 30));
	}
}
