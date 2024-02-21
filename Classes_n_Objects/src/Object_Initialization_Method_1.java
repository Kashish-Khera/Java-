
class Student_name
{
	int id; 
	String name;

}

public class Object_Initialization_Method_1 {

	public static void main(String[] args) {

			System.out.println("1)Initialization through reference");
			Student_name obj1 = new Student_name();
			Student_name obj2 = new Student_name();
			
			obj1.id = 100;
			obj1.name = "Chase Black"; 
			
			obj2.id = 200;
			obj2.name = "Madison Lipa"; 
			
			System.out.println(obj1.id  + " "  + obj1.name);
			System.out.println(obj2.id  + " "  + obj2.name);
	}

}
