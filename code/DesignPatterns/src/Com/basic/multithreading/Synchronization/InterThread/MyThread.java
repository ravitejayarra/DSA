package Com.basic.multithreading.Synchronization.InterThread;

public class MyThread implements Runnable {

	int t;
	
	@Override
	public void run() {

		System.out.println("myThread began");
		
		synchronized (this) {
			for(int i=0;i<100;i++) {
				t = t+i;
				try {
					Thread.sleep(90);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.notify();
		}
		
	}

}
