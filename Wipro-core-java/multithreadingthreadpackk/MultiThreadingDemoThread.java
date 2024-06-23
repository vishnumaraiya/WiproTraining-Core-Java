package multithreadingthreadpackk;

public class MultiThreadingDemoThread extends Thread {

	public void run() {
		try {
			//displaying the thread that is running 
			System.out.println("Thread "+ Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			// Exception throw
			System.out.println("Exception Caught");
		}
	}
	
}
