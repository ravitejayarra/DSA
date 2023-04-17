package Com.basic.multithreading.Synchronization;

public class DisplayMessage {

	
	public synchronized void sayHello(String name) {
		
		for(int i=0;i<20;i++) {
			
			System.out.println(" Hello "+ name);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
