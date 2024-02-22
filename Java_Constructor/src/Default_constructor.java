class bike {
	bike() {
		System.out.println("Default constructor called");
	}
}

class Student {
	int id;
	String name;

	void display() {
		System.out.println("ID is " + id + " " + " Name is " + name);
	}
}

public class Default_constructor {

	public static void main(String[] args) {

		// calling a default constructor
		bike obj = new bike();

		System.out.println("default constructor that displays the default values");

		Student one = new Student();
		one.display();

	}

}
