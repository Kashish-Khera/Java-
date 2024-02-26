class person {
	int id;
	String name;

	person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Emp extends person {
	float salary;

	Emp(int id, String name, float salary) {
		// reusing parent constructor
		super(id, name);

		this.salary = salary;

	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class Super_keyword_example_four {

	public static void main(String[] args) {

		Emp obj = new Emp(1, "QWERTY" , 45000f);
		obj.display();
	}

}
