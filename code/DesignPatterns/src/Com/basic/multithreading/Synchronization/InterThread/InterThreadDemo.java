package Com.basic.multithreading.Synchronization.InterThread;

public class InterThreadDemo {

	public static void main(String[] args) {

		
		MyThread my1 = new MyThread();
		
		Thread t1 = new Thread(my1);
		
		t1.start();
		
		
		synchronized (t1) {
			
			System.out.println(" inside InterThreadDemo");
			
			try {
				t1.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("after notifying");
			
			System.out.println(my1.t);
			
		}
		
	}

}
