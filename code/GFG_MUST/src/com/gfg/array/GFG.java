package com.gfg.array;
// Java program to count ways to choose
// triplets such that the distance between
// the farthest points <= L */
import java.util.*;

public class GFG
{

// Returns the number of triplets with the
// distance between farthest points <= L
static int countTripletsLessThanL(int n, int L,
								int[] arr)
{
	// sort the array
	Arrays.sort(arr);

	int ways = 0;
	for (int i = 0; i < n; i++)
	{

		// find index of element greater than arr[i] + L
		int indexGreater = upper_bound(arr, 0, n,
									arr[i] + L);

		// find Number of elements between the ith
		// index and indexGreater since the Numbers
		// are sorted and the elements are distinct
		// from the points btw these indices represent
		// points within range (a[i] + 1 and a[i] + L)
		// both inclusive
		int numberOfElements = indexGreater - (i + 1);

		// if there are at least two elements in between
		// i and indexGreater find the Number of ways
		// to select two points out of these

		if (numberOfElements >= 2)
		{
			ways += (numberOfElements *
					(numberOfElements - 1) / 2);
		}
	}
	return ways;
}

static int upper_bound(int[] a, int low,
					int high, int element)
{
	while(low < high)
	{
		int middle = low + (high - low) / 2;
		if(a[middle] > element)
			high = middle;
		else
			low = middle + 1;
	}
	return low;
}

// Driver Code
public static void main(String[] args)
{
	// set of n points on the X axis
	int arr[] = { 1, 2, 3 };

	int n = arr.length;
	int L = 4;

	int ans = countTripletsLessThanL(n, L, arr);

	System.out.println("Total Number of ways = " + ans);
}
}

// This code is contributed by 29AjayKumar
