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

// Problem 4
class Student {
	void displayInfo(String name) {
		System.out.println(name);
	}
	
	void displayInfo(String name, int id) {
		System.out.println(name + " " + id);
	}
}

class ScienceStudent extends Student {
	@Override
	void displayInfo(String name, int id) {
		System.out.println(name + " " + id + "\nDepartment: Science");
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

        // Problem 4
		Student s4;
		
		s4 = new Student();
		s4.displayInfo("Fazle Rabbi");
		s4.displayInfo("Mahfuz Zayn", 48005);
		
		s4 = new ScienceStudent();
		s4.displayInfo("Emran Hosen", 48002);

        // Problem 5
		Employee e = new Employee();
		
		System.out.println(e.calculateSalary());
		
		e = new FullTimeEmployee();
		System.out.println(e.calculateSalary());
		
		e = new PartTimeEmployee();
		System.out.println(e.calculateSalary());
	}
}
