package day3;
import java.util.List;

public class Id {
	static void insertNextId(List<Integer> list) {

		int max = 0;

		for (int id : list) {
			if (id > max) {
				max = id;
			}
		}
		
		list.add(++max);
		System.out.println("Inserted: " + Thread.currentThread().getName() + ", " + max);
	}
}


