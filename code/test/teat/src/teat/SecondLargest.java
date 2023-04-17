package teat;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,7,5};
		
		int firstLargest = Integer.MIN_VALUE,secLargest = Integer.MIN_VALUE;

		
		
		
				
		for(int i=0;i<a.length;i++) {
			
			if(a[i] > firstLargest) {
				
				secLargest  = firstLargest;
				
				firstLargest = a[i];       // largest number
			 
			}
			
			else if(a[i] > secLargest) {
				secLargest = a[i];
			}
			
			
		}
		
		
		
		System.out.println(secLargest);

	}

}
