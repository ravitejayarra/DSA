package Com.basic.multithreading.ThreadGroup;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		
		ThreadGroup parent = new ThreadGroup("Parent");
		
		Pair RunnableTarget = new Pair();
		
	    parent.setMaxPriority(4);
		
		Thread t1 = new Thread(parent, RunnableTarget, "t1");
		
		System.out.println(t1.getPriority());
		
		
		
	}

}
