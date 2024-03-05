import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Java_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> one = new ArrayList<String>();
		one.add("Mango");// Adding object in arraylist
		one.add("Apple");
		one.add("Banana");
		one.add("Grapes");
		

		System.out.println("----Printing the list");
		System.out.println(one);

		System.out.println("----Iterating through the List");
		Iterator<String> itr = one.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----Traversing list through for-each loop  ");
		for (String str : one) {
			System.out.println(str);
		}

		System.out.println("----Get and Set ArrayList");

		// it will return the 2nd element, because index starts from 0
		System.out.println("**return 2nd element " + one.get(1));
		
		// changing the element
		System.out.println("**Changing the element");
		one.set(1, "Fruit_name_changed");
		for (String str : one) {
			System.out.println(str);
		}
		

		System.out.println("--------OG List-------");
		for (String str : one) {
			System.out.println(str);
		}
		
		System.out.println("--------Sorted List------");
		Collections.sort(one);
		for (String str : one) {
			System.out.println(str);
		}
		
		
		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
         list.add("Ravi");//Adding object in arraylist  
         list.add("Vijay");  
         list.add("Ravi");  
         list.add("Ajay");  
         

		  System.out.println("--------Traversing list through List Iterator:");  

			
	         ListIterator<String> itr_two=list.listIterator(list.size());  

	         while(itr_two.hasPrevious())
	         {
	        	 String str = itr_two.previous();
	        	 System.out.println(str);
	         }
         
         System.out.println("Traversing list through for loop:");  
         for(int i=0;i<list.size();i++)  
         {  
          System.out.println(list.get(i));     
         }  

		

        
         
         
         System.out.println("Traversing list through forEachRemaining() method:");  
         Iterator<String> itr_three=list.iterator();  
         itr_three.forEachRemaining(a-> //Here, we are using lambda expression  
         {  
       System.out.println(a);  
         });  
         
         System.out.println("Traversing list through forEach() method:");  
         //The forEach() method is a new feature, introduced in Java 8.  
             list.forEach(a->{ //Here, we are using lambda expression  
                 System.out.println(a);  
               });  
         
         
         
         
         
         
	}

}
