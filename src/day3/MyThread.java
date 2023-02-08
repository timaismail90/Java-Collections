package day3;

public class MyThread extends Thread{
	int limitToStop;
	// Create a constructor to initialize the above instance variable
    MyThread(int limitToStop){
        this.limitToStop = limitToStop;
    
    }
    
    // Override the run() method here.
    
	@Override
	public void run() {
//		System.out.println("This thread is running");
		for(int i = 0; i <= limitToStop; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}

	
}


    

