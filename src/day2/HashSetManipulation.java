package day2;
import java.util.HashSet;

public class HashSetManipulation {
	public static void main(String[] args) {
		// Create a HashSet and populate it with initial values
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		
	
		// Print the size of the set
		System.out.println("Set size: "+ set.size());
		

		// Use for loop to print the values in the set
		for(String i: set) {
			System.out.println("Value: "+ i);
		}
		

		// Use add() method to add a new value to the set
		set.add("D");
		System.out.println("Set after using add(): ");
		for(String i: set) {
			System.out.println("Value: "+ i);
		}
		

		// Use remove() method to remove a value from the set
		set.remove("A");
		System.out.println("Set after using remove(): ");
		for(String i: set) {
			System.out.println("Value: "+ i);
		}
		
		

		// Use contains() method to check if the value "C" exists in the set
		if(set.contains("C")) {
			System.out.println("Value 'C' exists in the set. ");
		}
	}


}
