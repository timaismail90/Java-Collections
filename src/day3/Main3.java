package day3;

public class Main3 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		MyThread3 runnableClass = new MyThread3();
		
		Thread thread = new Thread(runnableClass);
		
		thread.start();
		
		thread.join();
		
		System.out.println("Thread has started");

	}

}
