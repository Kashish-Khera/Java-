class Animal1 {
	void eat() {
		System.out.println("Eat method from class ANIMAL called");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("Bark method from Dog class is callled");
	}
}

class babydog extends Dog1 {
	void weep() {
		System.out.println("weep method from baby dog class called");
	}
}

public class Multilevel_inheritance {

	public static void main(String[] args) {

		babydog d1 = new babydog();
		d1.eat();
		d1.bark();
		d1.weep();

	}

}
