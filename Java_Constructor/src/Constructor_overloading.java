
class StudentInfo
{
	int id; 
	String name;
	int age;
	
    //creating two arg constructor  
	StudentInfo(int i , String n)
	{
		id = i; 
		name = n;
	}
	
    //creating three arg constructor  
	StudentInfo(int i , String n , int a)
	{
		id = i; 
		name = n ; 
		age = a; 
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
}


public class Constructor_overloading {

	public static void main(String[] args) {

		
		StudentInfo obj1 = new StudentInfo(111, "Madison");
		StudentInfo obj2 = new StudentInfo(111, "Madison" , 20);
		
		obj1.display();
		obj2.display();
	}

}
