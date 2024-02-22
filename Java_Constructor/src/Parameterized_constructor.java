class StudentDetail
{
	int id ; 
	String name; 
	
	StudentDetail(int i , String n)
	{
		id = i; 
		name = n ;
	}
	
	void display()
	{
		System.out.println(id + " " + name);
	}
}

public class Parameterized_constructor {

	public static void main(String[] args) {
		
		StudentDetail obj1 = new StudentDetail(111, "QWERTY");
		StudentDetail obj2 = new StudentDetail(222, "QAZXSW");
		
		obj1.display();
		obj2.display();
		
	}

}
