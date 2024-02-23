
class student_data {
	int rollno;
	String name;
	float fee;

	student_data(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

}

public class this_usage_1 {

	public static void main(String[] args) {

		student_data obj1 = new student_data(111, "qwerty", 5000f);
		student_data obj2 = new student_data(200, "madison", 200f);

		obj1.display();
		obj2.display();

	}

}
