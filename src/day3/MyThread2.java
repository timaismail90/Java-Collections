package day3;

import java.util.List;

public class MyThread2 extends Thread {
	List<Integer>list;
	
	public MyThread2(String name, List<Integer> list) {
		super(name);
		this.list = list;
	}
	
	// Override the run() method here.
    
		@Override
	public void run() {
			Id.insertNextId(list);
		}

}
