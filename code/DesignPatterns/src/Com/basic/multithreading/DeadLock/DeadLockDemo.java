package Com.basic.multithreading.DeadLock;

public class DeadLockDemo implements Runnable {

	
	FirstResource fr = new FirstResource();
	SecondResource sr = new SecondResource();
	
	@Override
	public void run() {
   
		fr.method1(sr);
		
	}

	DeadLockDemo(){
		new Thread(this).start();
		
		sr.method1(fr);
	}
	
	
	public static void main(String[] args) {

		DeadLockDemo demo = new DeadLockDemo();
		
	}

}
