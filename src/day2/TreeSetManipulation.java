package day2;
import java.util.TreeSet;
public class TreeSetManipulation {
	public static void main(String[] args) {
        // Create a TreeSet and populate it with initial elements
		
		TreeSet<String> treeset = new TreeSet<String>();
		
		treeset.add("A");
		treeset.add("B");
		treeset.add("C");
		
       

        // Print the size of the set
		System.out.println("Set size: " + treeset.size());
        

        // Print the elements in the set
		
		System.out.println("Elements in set: " + treeset);
        

        // Use first() and last() methods to get the first and last elements
		System.out.println("First element: " + treeset.first());
		System.out.println("Last element: " + treeset.last());
		
        

        // Use headSet() and tailSet() methods to get the elements in the set that are less than or greater than a specific element
		System.out.println("Elements less than 'B': " +  treeset.headSet("B"));
		System.out.println("Elements greater than 'B': " + treeset.tailSet("B"));
        

        // Use subSet() method to get the elements in the set that are greater than or equal to a lower bound and less than an upper bound
		System.out.println("Elements between 'A' and 'C':" + treeset.subSet("A", "C"));
       

        // Use contains() method to check if a specific element exists in the set
        System.out.println("Does set contain 'B'? " + treeset.contains("B"));
		

        // Use remove() method to remove a specific element from the set
       
        treeset.remove("B");
        System.out.println("Set after removing 'B': " + treeset);
    }

}
