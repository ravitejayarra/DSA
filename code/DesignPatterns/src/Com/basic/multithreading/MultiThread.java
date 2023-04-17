package Com.basic.multithreading;

public class MultiThread extends Thread{

	public static void main(String[] args) {

		MultiThread Mt = new MultiThread();
		Mt.start();
		
		
		Thread current = Thread.currentThread();
		
		System.out.println(current.getName());
		
		for(int j=0;j<200;j++) {
			System.out.print("j : " + j + "\t");
			//System.out.println(current.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println();
	}
	
	public void run() {
		
		Thread current = Thread.currentThread();
		current.setName("secondary main");
		
		System.out.println(current.getName());
		
		for(int i=0;i<200;i++) {
			System.out.print("i : " + i + "\t");
			//System.out.println(current.getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
