package multithreading;

public class MultiThreadingRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
        {        // Displaying the thread that is running
            System.out.println ("Thread " + Thread.currentThread().getId() +  " is running using runnable interface");
  
        }
        catch (Exception e)
        {        System.out.println ("Exception is caught");       }
	}

}
