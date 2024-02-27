interface Printable {
	void print();
}

interface Showable extends Printable {
	void show();
}

public class Interface_Inheritance implements Showable {

	@Override
	public void print() {

		System.out.println("PRINT method in interface inhertance class");
	}

	@Override
	public void show() {
		System.out.println("SHOW method in interface inhertance class");

	}

	public static void main(String[] args) {

		Interface_Inheritance obj = new Interface_Inheritance();
		obj.print();
		obj.show();
	}

}
