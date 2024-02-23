
class student {
//	instance variable -- value bwill be dynamic for these two variable in this case
	int rollno;
	String name;

//	STATIC VARIBALE --CLG NAME WILL BE SAME FOR ALL 
	static String college = "IPU";

//	CONSTRUCTOR
	student(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

public class Static_variable {

	public static void main(String[] args) {

		student obj1 = new student(111, "qwerty");
		student obj2 = new student(200, "Madison");

		obj1.display();
		obj2.display();

//		we can chnage the collg name for all the student like this : 

		System.out.println("\nCollege name chnaged\n");

		student.college = "GNIOT";
		obj1.display();
		obj2.display();

	}

}
