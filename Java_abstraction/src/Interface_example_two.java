interface drawable {
	void draw();
}

class rectangle1 implements drawable {

	@Override
	public void draw() {

		System.out.println("print method from class RECTANGLE");
	}

}

class circle1 implements drawable {

	@Override
	public void draw() {

		System.out.println("print method from class CIRCLE");
	}

}

public class Interface_example_two {

	public static void main(String[] args) {

		// In real scenario, object is provided by method e.g. getDrawable()
		drawable d = new circle1();
		d.draw();
	}

}
