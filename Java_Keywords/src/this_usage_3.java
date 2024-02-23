class qwerty {
	qwerty() {
		System.out.println("Hello from qwerty class");
	}

	qwerty(int x) {
		this();
		System.out.println(x);

	}
}

public class this_usage_3 {

	public static void main(String[] args) {

		System.out.println("invoke current class constructor");

		qwerty a = new qwerty(10);

	}

}
