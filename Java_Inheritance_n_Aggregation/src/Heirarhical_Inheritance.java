class Animal2 {
	void eat() {
		System.out.println("Eat method from class ANIMAL called");
	}
}

class Dog2 extends Animal2 {
	void bark() {
		System.out.println("Bark method from Dog class is callled");
	}
}

class cat2 extends Animal2 {
	void meow() {
		System.out.println("meow method from cat class called");
	}
}

public class Heirarhical_Inheritance {

	public static void main(String[] args) {

		cat2 obj = new cat2();
		obj.eat();
		obj.meow();
		

	}

}
