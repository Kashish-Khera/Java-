class super_class {
	int num = 20;

	void display() {
		System.out.println("Display method of super-class");
	}
}

class sub_class extends super_class {
	int num = 10;

	void display() {
		System.out.println("Display method of sub-class");
	}

	void my_method() {
		sub_class obj = new sub_class();

		// Invoking the display() method of sub class
		obj.display();
		// Invoking the display() method of superclass
		super.display();

		System.out.println("num in sub-class  " + obj.num);
		System.out.println("num in super-class  " + super.num);
	}
}

public class Super_keyword {

	public static void main(String[] args) {

		sub_class obj = new sub_class();
		obj.my_method();
	}

}
