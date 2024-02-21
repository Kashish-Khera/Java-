class StudentData {
	int rollno;
	String name;

//	methods
	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	void DisplayData() {
		System.out.println(rollno + " " + name);
	}
}

public class object_initialization_Method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentData s1 = new StudentData();
		StudentData s2 = new StudentData();
		
		s1.insertRecord(1, "Lily");
		s2.insertRecord(2, "Aaron");
		
		s1.DisplayData();
		s2.DisplayData();

	}

}
