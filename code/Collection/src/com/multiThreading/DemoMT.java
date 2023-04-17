package com.multiThreading;

public class DemoMT{
      
	
	public static void main(String[] args) throws InterruptedException {

		
	 //   DemoMT mt = new DemoMT();
	    Thread myThread = new Thread( () ->{
	    	for(int i=0;i<40;i++) {
				System.out.print(" T "+ Thread.currentThread().getPriority());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				finally {
					System.out.print(" ");
				}
			}
	    	
	    },"app");
	    
	    
	    Thread myThread1 = new Thread(() ->{
	    	for(int i=0;i<40;i++) {
				System.out.print(" A "+ Thread.currentThread().getPriority());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				finally {
					System.out.print(" ");
				}
			}
	    	
	    },"sql");
	    
		
	    
	    myThread.start();
	    myThread1.start();
	    
	    
	    myThread.setPriority(Thread.MAX_PRIORITY);
	    
	    
	    System.out.println(myThread.getName());
	    System.out.println(myThread1.getName());
	    
	    System.out.println("---"+myThread.isAlive());
	    
	    myThread.join();
	    
	    System.out.println("---"+myThread.isAlive());
	    
	    for(int i=0;i<40;i++) {
			System.out.print(" MAIN ");
			Thread.sleep(100);
		}
	    
	    
	}

//	@Override
//	public void run() {
//		
//		for(int i=0;i<40;i++) {
//			System.out.print(" thread -1 ");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			finally {
//				System.out.print(" finally ");
//			}
//		}
//		
//	}

}



/*
* implement runnable or extend Thread class 
* 
* override run method  -- for thread
* 
* start thread by using(calling)  mythread.start(); method
* 
* If you call run method directly , threads  execution will be sequential.
* 
* If you throw runtime exception in one thread or main method other threads will run just fine.
* 
* 


*/