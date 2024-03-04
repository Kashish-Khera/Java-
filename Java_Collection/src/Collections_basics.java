import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Collections_basics {

	public static void main(String[] args) {

		System.out.println("\n----------1.ARRAYLIST --------\n");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Chase Black");
		list.add("Madison");
		list.add("Aaron");
		list.add("Lily");
		list.add("Rhysand");

		// Traversing list through Iterator
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("\n----------2.LINKEDLIST --------\n");

		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Chase Black");
		list2.add("Madison");
		list2.add("Aaron");
		list2.add("Lily");
		list2.add("Rhysand");

		Iterator<String> itr2 = list2.iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("\n----------3.VECTOR--------\n");

		Vector<String> list3 = new Vector<String>();
		list3.add("Chase Black");
		list3.add("Madison");
		list3.add("Aaron");
		list3.add("Lily");
		list3.add("Rhysand");

		Iterator<String> itr3 = list3.iterator();

		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

		System.out.println("\n----------4.STACK--------\n");

		Stack<String> list4 = new Stack<String>();

		list4.push("Chase Black");
		list4.push("Madison");
		list4.push("Aaron");
		list4.push("Lily");
		list4.push("Rhysand");

		list4.pop();

		Iterator<String> itr4 = list4.iterator();

		while (itr4.hasNext()) {
			System.out.println(itr4.next());
		}

		System.out.println("\n----------5.PRIORITY QUEUE--------\n");

		PriorityQueue<String> list5 = new PriorityQueue<String>();

		list5.add("Chase Black");
		list5.add("Madison");
		list5.add("Aaron");
		list5.add("Lily");
		list5.add("Rhysand");
		System.out.println("head:" + list5.element());
		System.out.println("head:" + list5.peek());
		System.out.println("****iterating the queue elements:");
		Iterator<String> itr5 = list5.iterator();

		while (itr5.hasNext()) {
			System.out.println(itr5.next());
		}

		list5.remove();
		list5.poll();

		System.out.println("****after removing two elements:");
		Iterator<String> itr5_a = list5.iterator();
		while (itr5_a.hasNext()) {
			System.out.println(itr5_a.next());
		}

	
		System.out.println("\n----------6.DEQUEUE--------\n");

		Deque<String> list6 = new ArrayDeque<String>();

		list6.add("Chase Black");
		list6.add("Madison");
		list6.add("Aaron");
		list6.add("Lily");
		list6.add("Rhysand");
		
	
		//Traversing elements  

		for(String str : list6)
		{
			System.out.println(str);
		}
	
	
		System.out.println("\n----------7.HashSet--------\n");

		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//Traversing elements  
		Iterator<String> itr7=set.iterator();  
		while(itr7.hasNext()){  
		System.out.println(itr7.next());  
		}  
		
		
		
		
		System.out.println("\n----------8.LinkedHashSet--------\n");
		LinkedHashSet<String> set2=new LinkedHashSet<String>();  
		set2.add("Ravi");  
		set2.add("Vijay");  
		set2.add("Ravi");  
		set2.add("Ajay");  
		Iterator<String> itr8=set2.iterator();  
		while(itr8.hasNext()){  
		System.out.println(itr8.next());  
		}  
		
		
		System.out.println("\n----------9.TreeSet--------\n");

		TreeSet<String> list9=new TreeSet<String>();  
		list9.add("Ravi");  
		list9.add("Vijay");  
		list9.add("Ravi");  
		list9.add("Ajay");  
		//traversing elements  
		Iterator<String> itr9=list9.iterator();  
		while(itr9.hasNext()){  
		System.out.println(itr9.next());  
		}  
		
		
		
		
	
	}

}
