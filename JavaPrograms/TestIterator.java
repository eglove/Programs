import java.util.*;

public class TestIterator {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();
		collection.add("New York");
		collection.add("Atlanta");
		collection.add("Dallas");
		collection.add("Madison");
		
		for(String element: collection)
			System.out.print(element.toUpperCase() + " ");
		System.out.println();
	}
}