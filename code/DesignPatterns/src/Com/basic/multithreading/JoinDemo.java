package Com.basic.multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread{
	
	static int sum =0;
	static int n;

	public static void main(String[] args) {

		
		long start = System.currentTimeMillis();
		
		Scanner sc  = new Scanner(System.in);
		 n = sc.nextInt();
		JoinDemo jd = new JoinDemo();
		jd.start();
		
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("sum is : " + sum);
		
		
		long end = System.currentTimeMillis();
		
		
		System.out.println("total time taken : " + (end-start)/1000);
	}
	
	public void run() {
		
		for(int i=0;i<=n;i++) {
			sum += i;
			try {
				Thread.sleep(0);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
