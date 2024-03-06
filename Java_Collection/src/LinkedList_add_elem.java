import java.util.LinkedList;
import java.util.*;

public class LinkedList_add_elem {

	public static void main(String[] args) {

		LinkedList<String> list_one = new LinkedList<String>();
		list_one.add("Apple");
		list_one.add("Mango");
		list_one.add("Banana");
		list_one.add("Orange");
		list_one.add("Grapes");

		Iterator<String> itr_one = list_one.iterator();
		while (itr_one.hasNext()) {
			System.out.println(itr_one.next());

		}

		LinkedList<String> list_two = new LinkedList<String>();
		list_two.add("Red");
		list_two.add("Pink");
		list_two.add("Black");
		list_two.add("Orange");
		list_two.add("Purple");

		System.out.println(" ------OG List-------------");
		System.out.println(list_two);

		System.out.println("\n--------After invoking add(E e) method: ");
		list_two.add(1, "Color_change");
		System.out.println(list_two);

		System.out.println("\n----OG LIST'S------\n");
		System.out.println("--LIST 1 \n");
		System.out.println(list_one);
		System.out.println("---LIST - 2\n");
		System.out.println(list_two);

		System.out.println("\n-----Adding second list elements to the first list");

		list_one.addAll(list_one);
		System.out.println(list_one);

		LinkedList<String> list_three = new LinkedList<String>();
		list_three.add("ONE");
		list_three.add("TWO");

		System.out.println("\n---------Adding second list elements to the first list at specific position");
		list_one.addAll(1, list_three);

		System.out.println(list_one);
		
		System.out.println("\n\n");
		
		System.out.println("------Adding an element at the first position ");
		list_two.addFirst("First_Elem");
		System.out.println(list_two);
		
		System.out.println("--------Adding an element at the last position  ");
		
		list_two.addLast("Last_elem");
		System.out.println(list_two);
		
		
		
		
		
		
		
	}

}
