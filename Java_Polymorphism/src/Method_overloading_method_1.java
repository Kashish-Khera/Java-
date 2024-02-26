class adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class Method_overloading_method_1 {

	public static void main(String[] args) {

		System.out.println("Method 1 :  " + adder.add(10, 20));
		System.out.println("Method 2 : " + adder.add(100, 200, 300));
	}

}
