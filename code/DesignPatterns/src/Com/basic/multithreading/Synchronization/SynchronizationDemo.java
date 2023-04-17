package Com.basic.multithreading.Synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {

		
		DisplayMessage dm = new DisplayMessage();
		
		
		MyThread my1 = new MyThread(dm, "ravi");
		MyThread my2 = new MyThread(dm, "teja");
		
		Thread t1 = new Thread(my1);
		Thread t2 = new Thread(my2);
		
		t1.start();
		t2.start();
	}

}
