package cse107;

public class StudentInformation {
	String name;
	int id;
	String department;
	
	void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(department);
	}
	
	void displayInfoByThis(String name, int id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(department);
	}
}
