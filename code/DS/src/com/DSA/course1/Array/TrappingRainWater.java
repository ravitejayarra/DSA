package com.DSA.course1.Array;

public class TrappingRainWater {

	public static void main(String[] args) {

		int a[] = {5,2,4,0,3,2};
		int aL[] = new int[a.length];
		int aR[] = new int[a.length];
		int water[] = new int[a.length];
		int n = a.length;
		 aL[0]    =  0;
		aR[n-1]   =  0;
		
		for(int i=1;i<n;i++)
			aL[i] = Math.max(a[i-1], aL[i-1]);
		
		for(int i = n-2;i>=0;i--)
			aR[i] = Math.max(a[i+1],aR[i+1]);
		
		for(int i=0;i<n;i++) {
			int p = Math.min(aL[i],aR[i])-a[i];
			if( p > 0) {
				water[i] = p;
			}
			else {
				water[i] =0;
			}
		}
		
		for (int i : water) {
			System.out.print(i + " ");
		}
		
	}

}
