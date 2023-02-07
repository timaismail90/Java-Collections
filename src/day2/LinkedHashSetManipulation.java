package day2;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetManipulation {
	public static void main(String[] args) {
		
		// Create a LinkedHashSet and populate it with initial elements
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		

		// Print the size of the set
		System.out.println("Set size: " + set.size());
		

		// Use for each loop to print the elements in the set
		System.out.println("Element in the set (using for-each loop):");
//		
		set.forEach(element -> System.out.println("Elements: " + element));
		

		// Use iterator to print the elements in the set
		Iterator<String> iterator = set.iterator();
		System.out.println("Elements in the set (using iterator):");
		while(iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
		
		//Use the  add() method to add a new element "D" to the set.
//		set.add("D");
//		System.out.println("Set after using add(): " + set);


		// Use remove() method to remove an element from the set
		set.remove("A");
		System.out.println("Set after using remove(): " + set);
		
		

		// Use contains() method to check if an element exists in the set
		if(set.contains("B")) {
			System.out.println("Element 'B' exists in the set. ");
		}
		
	

		// Use clear() method to remove all elements from the set
		set.clear();
		System.out.println("Set after using clear(): "+ set);
		
	}

}
