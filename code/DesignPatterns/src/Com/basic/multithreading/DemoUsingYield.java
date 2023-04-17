package Com.basic.multithreading;

public class DemoUsingYield extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++){
			System.out.print("Child Thread \t");
			Thread.yield();
		}
	}

}
