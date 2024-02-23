class student_info {
	int rollno;
	String name;
	static String college = "IPU";

	// static method to change the value of static variable

	static void change_clg_name() {
		college = "GNIOT";
	}

	student_info(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() 
	{
		System.out.println(rollno + " " + name + " " + college);
	}

}

public class static_method {

	public static void main(String[] args) {
			
		student_info obj1 = new student_info(111, "qwerty");
		student_info obj2 = new student_info(200, "Madison");
		
		obj1.display();
		obj2.display();
		
		System.out.println("\n Clg name change \n");
		
//		calling the college name change method 
		student_info.change_clg_name();
		
		obj1.display();
		obj2.display();
	}

}
