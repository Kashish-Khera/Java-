import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class User_defined_object_in_arraylist {

	public static void main(String[] args) {
		
		arraylist_user_defined_Object_example_class   obj1 = new arraylist_user_defined_Object_example_class(101, "Chase" , 25);
		arraylist_user_defined_Object_example_class   obj2 = new arraylist_user_defined_Object_example_class(101, "Madison" , 25);
		arraylist_user_defined_Object_example_class   obj3 = new arraylist_user_defined_Object_example_class(101, "Aaron" , 25);
					
		
		
		ArrayList<arraylist_user_defined_Object_example_class>  list_one = new ArrayList<arraylist_user_defined_Object_example_class>();
		list_one.add(obj1);
		list_one.add(obj2);
		list_one.add(obj3);
		
		java.util.Iterator<arraylist_user_defined_Object_example_class> itr_a =  list_one.iterator();
		
		while(itr_a.hasNext())
		{
			arraylist_user_defined_Object_example_class obj = itr_a.next();
			System.out.println(obj.rollno  + " " + obj.name + "  "  + obj.age) ;
			
		}
		
		
	}

}
