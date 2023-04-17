package Com.basic.multithreading;

public class singleThread {

	public static void main(String[] args) {
		
		singleThread st  =  new singleThread();
		st.getNumbers();

		for(int j=0;j<200;j++) {
			System.out.print("j : " + j + "\t");
		}
	}

	
	public void getNumbers() {
		
		
		for(int i=0;i<200;i++) {
			System.out.print("i : " + i + "\t");
		}
	}
}
