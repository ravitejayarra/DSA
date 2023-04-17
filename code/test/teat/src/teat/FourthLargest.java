package teat;

import java.util.PriorityQueue;

public class FourthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,45,121,34,56,234,123};
		
		int forthLargest = FourthLargest(arr);
		System.out.println(forthLargest);
		
	}
	
	public static int FourthLargest(int arr[]) {
		
		
		
		PriorityQueue<Integer> priorityNumbers = new PriorityQueue<>();
		
		for(int i=0;i<4;i++) {
			priorityNumbers.add(arr[i]);
		}
		
		for(int i=4;i<arr.length;i++) {
			
			if(arr[i] > priorityNumbers.peek()) {
				priorityNumbers.poll();
				priorityNumbers.add(arr[i]);
			}
		}
		
		
		return priorityNumbers.peek();
	}

}
