
public class Method_overloading_with_type_promotion {

	void sum(int a, long b) {
		System.out.println("Sum method 1 : " + (a + b));
	}

	void sum(int a, int b, int c) {
		System.out.println("Sum method 2 : " + (a + b + c));
	}

	public static void main(String[] args) {

		Method_overloading_with_type_promotion obj = new Method_overloading_with_type_promotion();

		// now second int literal will be promoted to long
		
		obj.sum(20, 20);
		obj.sum(20, 20, 20);

	}

}
