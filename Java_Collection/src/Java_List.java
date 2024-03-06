import java.util.ArrayList;
import java.util.List;

public class Java_List {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Orange");
		list.add("Grapes");

		for (String str : list) {
			System.out.println(str);
		}

		List<String> array_TO_List = new ArrayList<String>();

		System.out.println("Array To LIST");
		String[] array = { "Red", "Purple", "Pink", "Brown", "Green", "Yellow" };

		for (String str : array) {
			array_TO_List.add(str);
		}

		System.out.println(array_TO_List);

	}

}
