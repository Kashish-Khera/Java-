
class A {
	A get() {
		return this;
	}
}

class B extends A {
	B get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

}

public class Covarient_return_type {

	public static void main(String args[]) {

		new B().get().message();
	}
}