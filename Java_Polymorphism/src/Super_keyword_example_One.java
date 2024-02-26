class Animal {
	String color = "white";
}

class Dog extends Animal {
	String color = "Black";

	void print_color() {
		System.out.println("Color of the dog : " + color);
		System.out.println("Color of the Animal class : " + super.color);
	}
}

public class Super_keyword_example_One {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.print_color();

	}

}
