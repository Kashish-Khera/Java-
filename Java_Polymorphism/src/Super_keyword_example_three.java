class Animal2 {

	Animal2() {
		System.out.println("Animal class Constructor");
	}
}

class Dog2 extends Animal2 {

	Dog2() {
		super();
		System.out.println("Dog class constructor");
	}

}

public class Super_keyword_example_three {

	public static void main(String[] args) {

		Dog2 d = new Dog2();

	}

}
