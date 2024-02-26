class sum {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b ;
	}
}

public class Method_overloading_method_2 {

	public static void main(String[] args) {

		System.out.println("Method 1 :  " + sum.add(10, 20));
		System.out.println("Method 2 : " + sum.add(12.3, 12.6));
	}

}
