class counter_without_static_variable {
	// will get memory each time when the instance is created
	int count = 0;

	counter_without_static_variable() {
		count++;
		System.out.println("counter_without_static_variable class counter  " + count);
	}
}

class counter_with_static_variable {
	// will get memory only once and retain its value
	static int count = 0;

	counter_with_static_variable() {
		count++;
		System.out.println("counter_with_static_variable --COUNT  " + count);
	}
}

public class static_variable_counter_example {

	public static void main(String[] args) {

		counter_without_static_variable c1 = new counter_without_static_variable();
		counter_without_static_variable c2 = new counter_without_static_variable();
		counter_without_static_variable c3 = new counter_without_static_variable();

		System.out.println("\n Using Static variable \n");

		counter_with_static_variable obj1 = new counter_with_static_variable();
		counter_with_static_variable obj2 = new counter_with_static_variable();
		counter_with_static_variable obj3 = new counter_with_static_variable();

	}

}
