class Animal1 {

	void eat() {
		System.out.println("Eating method from Animal Class");
	}
}

class Dog1 extends Animal1 {

	void eat() {
		System.out.println("Eat method from Dog class");
	}

	void bark() {
		System.out.println("Bark method from dog class");
	}

	void work() {
		super.eat();
		bark();
	}

}

public class Super_keyword_example_two {

	public static void main(String[] args) {

		Dog1 d = new Dog1();
		d.work();

	}

}
