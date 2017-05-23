package com.arr;

import java.util.Arrays;

/*Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Sum of large element of min (a,b)

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4.


Just try another one like (1, 4) and (2, 3)
step one: min(1, 4) = 1, min(2, 3) = 2;
step two: add the mins, sum = 1 + 2 = 3;
step three: compare this to our best pairs, 3 < 4.
Obviously, 4 is larger, so (1, 2) and (3, 4) are better pairs than (1, 4) and (2, 3).
The point here is: for each pair, we calculate min(a, b), but for sum of all the mins, we want the largest sum.
Is this clear for you?


*/


public class ArrayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={4,3,1,2};
		int i=0,maxSum=0;
		
		Arrays.sort(arr);
		
		for(;i<arr.length;){
			
			maxSum+=arr[i];
			i=i+2;
		}
		
		System.out.println("Max sum of min pair value " + maxSum);

	}

}
