
package Com.basic.multithreading.DeadLock;

public class SecondResource {

	
	
	public synchronized void method1(FirstResource fr) {
		
		System.out.println("Inside Method1 in SR");
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("invoking method2 in first One");
		
		fr.method2();
		
		
	}
	
	
    public synchronized void method2() {
		
    	System.out.println("Inside Method2");
		
	}
}
