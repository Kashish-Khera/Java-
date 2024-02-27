abstract class bike1 {
	bike1() {
		System.out.println("Bike constructor");
	}

	abstract void run1();

	void changegear() {
		System.out.println("Gear from BIKE Class");
	}
}

class honda1 extends bike1 {

	@Override
	void run1() {

		System.out.println("run method from HONDA class");
	}

}

public class abstract_class_example_three {

	public static void main(String[] args) {

		bike1 obj = new honda1();
		obj.run1();
		obj.changegear();
	}

}
