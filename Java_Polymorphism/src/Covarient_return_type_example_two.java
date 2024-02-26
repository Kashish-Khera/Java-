
class A1 {
	A1 foo() {
		return this;
	}

	void print() {
		System.out.println("Inside the class A1");
	}
}

//A2 is the child class of A1  
class A2 extends A1 {

	A1 foo() {
		return this;
	}

	void print() {
		System.out.println("Inside the class A2");
	}

}

//A3 is the child class of A2  
class A3 extends A2 {
	A1 foo() {
		return this;
	}

	void print() {
		System.out.println("Inside the class A3");
	}
}

public class Covarient_return_type_example_two {

	public static void main(String args[]) {

//		A1 a1 = new A1();
//		a1.foo().print();
//		// we need to do the type casting to make it
//		// more clear to reader about the kind of object created
//		A2 a2 = new A2();
//		((A2) a2.foo()).print();
//		A3 a3 = new A3();
//		// doing the type casting
//		((A3) a3.foo()).print();

//		another way to write obove code : 

		A1 a1 = new A1();
		a1.foo().print();

		A2 a2 = new A2();
		a2.foo().print();

		A3 a3 = new A3();
		a3.foo().print();

	}
}
