class operations {
	int square(int n) {
		return n * n;
	}
}

class circle {
	operations op; // aggregation
	double pi = 3.14;

	double area(int radius) {
		op = new operations();

		// code reusability (i.e. delegates the method call).
		int r_square = op.square(radius);

		return pi * r_square;
	}

}

public class Aggregation {

	public static void main(String[] args) {

		circle c = new circle();
		double result = c.area(5);
		System.out.println(result);

	}
}
