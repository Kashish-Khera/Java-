class Animal {
	void eat() {
		System.out.println("Eat method from class ANIMAL called");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Bark method from Dog class is callled");
	}
}

public class Single_inheritance {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.eat();
		d.bark();
		
		
//		Animal a = new Animal();
//		a.eat();
//		a.bark();

	}

}
