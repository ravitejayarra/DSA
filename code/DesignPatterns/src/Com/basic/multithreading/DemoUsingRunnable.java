package Com.basic.multithreading;

public class DemoUsingRunnable implements Runnable {

	@Override
	public void run() {

		System.out.println("In Action ");
	}

	public static void main(String[] args) {

		DemoUsingRunnable demo = new DemoUsingRunnable();
		
		Thread T = new Thread(demo);
		
		T.start();

		// Reason to Runnable interface , so we can extend other classes , 
		// java does Not support multiple inheritance
		
	}

}
