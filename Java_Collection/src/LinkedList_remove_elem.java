import java.util.LinkedList;

public class LinkedList_remove_elem {

	public static void main(String[] args) {

		LinkedList<String> ll_one = new LinkedList<String>();
		ll_one.add("Red");
		ll_one.add("Orange");
		ll_one.add("Purple");
		ll_one.add("Green");
		ll_one.add("Pink");
		ll_one.add("Yellow");
		ll_one.add("Brown");
		ll_one.add("Cyan");

		System.out.println(ll_one);
		ll_one.remove("Green");
		System.out.println("\nGreen Removed , new List is : ");
		System.out.println(ll_one);

		System.out.println("\nRemoving element on the basis of specific position");
		ll_one.remove(2);
		System.out.println(ll_one);

		LinkedList<String> ll_two = new LinkedList<String>();
		ll_two.add("Apple");
		ll_two.add("Mango");
		ll_two.add("banana");
		ll_two.add("Orange");
		ll_two.add("Grapes");

		ll_one.addAll(ll_two);
		System.out.println("\nNEW LIST : ");
		System.out.println(ll_one);
		System.out.println("\nRemoving all the new elements from arraylist");
		ll_one.removeAll(ll_two);
		System.out.println(ll_one);

		System.out.println(ll_two);
		System.out.println("\nRemoving first element from the list  ");
		ll_two.removeFirst();
		System.out.println(ll_two);

		System.out.println("\nRemoving last element from the list  ");
		ll_two.removeLast();
		System.out.println(ll_two);

		ll_two.add("Apple");
		ll_two.add("Mango");
		System.out.println(ll_two);

		System.out.println("\nRemoving first occurrence of element from the list");
		ll_two.removeFirstOccurrence("Apple");
		System.out.println("\nNew List :");
		System.out.println(ll_two);
		System.out.println("\nRemoving last occurrence of element from the list");
		ll_two.removeLastOccurrence("Mango");
		System.out.println("\nNew List :");
		System.out.println(ll_two);
		
		
		System.out.println(" \nRemoving all the elements available in the list  ");
		ll_two.clear();
		System.out.println(ll_two);

	}

}
