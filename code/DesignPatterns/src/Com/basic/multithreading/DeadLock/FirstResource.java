package Com.basic.multithreading.DeadLock;

public class FirstResource {

	
	
	public synchronized void method1(SecondResource sr) {
		
		System.out.println("Inside Method1 in FR");
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("invoking method2 in second One");
		
		sr.method2();
		
	}
	
	
    public synchronized void method2() {
		
    	System.out.println("Inside Method2");
		
	}
}
