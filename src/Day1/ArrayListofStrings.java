package Day1;
	import java.util.*; // REQUIRED IMPORT for ArryaList and List

	public class ArrayListofStrings {
	    public static void main(String[] args) {
	       // DECLARE, INITIALIZE, SIZE, and PRINT
	       ArrayList<String> nameList = null;
	       System.out.println(nameList);
	       nameList = new ArrayList<String>();
	       System.out.println(nameList);
	       System.out.println("size is " + nameList.size());
	       
	       // ADD w/o index
	       nameList.add("Andrea");
	       System.out.println(nameList);
	       nameList.add("Bob");
	       System.out.println(nameList);
	       nameList.add("Carrie");
	       System.out.println(nameList);
	       nameList.add("Eduardo");
	       System.out.println(nameList);
	       System.out.println("size is " + nameList.size());
	 
	       // ADD w/ index
	       nameList.add(3, "Dierdre");
	       System.out.println(nameList);
	       System.out.println("size is " + nameList.size());

	       // GET
	       System.out.println("name at index 2 is " + nameList.get(2));

	       // SET
	       nameList.set(1, "Tori");
	       System.out.println(nameList);
	       System.out.println("size is " + nameList.size());

	       // REMOVE
	       nameList.remove(3);
	       System.out.println(nameList);
	       System.out.println("size is " + nameList.size());
	    }
	 }


