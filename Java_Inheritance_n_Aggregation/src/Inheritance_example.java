
class employee {
	float salary = 30000;

}

public class Inheritance_example extends employee {

	int bonus = 10000;

	public static void main(String[] args) {

		Inheritance_example obj = new Inheritance_example();

		System.out.println("Salary is " + obj.salary);
		System.out.println("bonus is " + obj.bonus);
	}

}
