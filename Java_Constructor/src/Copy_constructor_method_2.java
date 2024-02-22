
class student_data_two {
	int id;
	String name;

	student_data_two(int i, String n) {
		id = i;
		name = n;
	}

	student_data_two() {
	}

	void display() {
		System.out.println(id + " " + name);
	}
}

public class Copy_constructor_method_2 {

	public static void main(String[] args) {
		
		student_data_two obj1 = new student_data_two(111, "QWERTY");
		student_data_two obj2 = new student_data_two();
		
		obj2.id = obj1.id;
		obj2.name = obj1.name; 
		
		obj1.display();
		obj2.display();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
