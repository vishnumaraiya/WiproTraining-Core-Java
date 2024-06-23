package multithreading;

public class TestMultiThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8; // Number of threads
	     for (int i=0; i<n; i++)
	     {   Thread  t1 = new Thread(new MultiThreadingRunnable()); //When you create thread by implementing Runnable interface
	     // MultithreadingDemoThread object = new MultithreadingDemoThread();  //Using Thread extends
	         t1.start();  //1. To start a newly created thread.
	         				  // 2. The thread moves from New state to the Runnable state.
	         				  // 3. When the thread gets a chance to execute, its target run() method will run.
	     }

	}

}
