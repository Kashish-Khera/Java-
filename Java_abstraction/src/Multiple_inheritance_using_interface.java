interface printable1 {
	void print();
}

interface showable {
	void show();
}

class A2 implements printable1, showable {

	@Override
	public void show() {
		System.out.println("SHOW method from class A2");
	}

	@Override
	public void print() {
		System.out.println("PRINT method from class A2");

	}

}

public class Multiple_inheritance_using_interface {

	public static void main(String[] args) {
		
		A2 obj = new A2();
		 obj.print();
		 obj.show();
	}

}
