
public class Passing_parameter_by_value {

	public static void swap_fun(int a, int b) {
		System.out.println("Before swapping  ");
		System.out.println("a : " + a + "  b : " + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping  ");
		System.out.println("a : " + a + "  b : " + b);

	}

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		swap_fun(a, b);
	}

}
