package Com.basic.multithreading;

public class DemoUsingYieldApp {

	public static void main(String[] args) {
        
		DemoUsingYield demo  = new DemoUsingYield();
		
		demo.start();
		
		
		
		for(int i=0;i<10;i++){
			System.out.print("parent Thread \t");
			
		}
		
	}
	
	
	

}
