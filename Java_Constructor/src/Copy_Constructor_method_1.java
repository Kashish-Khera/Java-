class Student_Data{
	int id;
	String name;

	Student_Data(int i, String n) {
		id = i;
		name = n;
	}

	// constructor to initialize another object

	Student_Data(Student_Data s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

}

public class Copy_Constructor_method_1 {

	public static void main(String[] args) {
		
		Student_Data obj1 = new Student_Data(111 , "QWERTY");
		Student_Data obj2 = new Student_Data(obj1);
		
		obj1.display();
		obj2.display();
				
		
		
	}

}
