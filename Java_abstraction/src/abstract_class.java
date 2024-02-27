abstract class shape {
	abstract void draw();
}

class rectangle extends shape {

	@Override
	void draw() {

		System.out.println("Draw method from RECTANGLE class");
	}
}

class circle extends shape {

	@Override
	void draw() {
		System.out.println("Draw method from CIRCLE class");
	}
}

public class abstract_class {

	public static void main(String[] args) {
		
		shape s = new circle();
		s.draw();
		

	}

}
