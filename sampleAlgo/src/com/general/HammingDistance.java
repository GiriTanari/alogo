package com.general;

public class HammingDistance {

	
/*	The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
	Given two integers x and y, calculate the Hamming distance.

	Note:
	0 ≤ x, y < 231.

	Example:
	Input: x = 1, y = 4
	Output: 2
	Explanation:
	1   (0 0 0 1)
	4   (0 1 0 0)
	       ↑   ↑
	The above arrows point to positions where the corresponding bits are different.

	
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Solution 1:");		
		int i=123,j=4,res,count;
/*		
		num1= Integer.toBinaryString(i);
		num2=Integer.toBinaryString(j);
*/		

//Smiple Solution : 		

		res=i ^ j;
		System.out.println(res);
		System.out.println(Integer.bitCount(res));
		
//Solution 2
		System.out.println("Solution 2:");
		//System.out.println(res + Integer.toBinaryString(res) + "====> " + (res & 1));
		//res = res >>1
		count =0;
		System.out.println(Integer.toBinaryString(res));
		while(res!=0){
			
			count = count + (res & 1);
			res = res >> 1;
			
		}
		
		System.out.println(count);
//Solutions 3
	/*	Subtraction of 1 from a number toggles all the bits (from right to left) till the rightmost set bit(including the righmost set bit). So if we subtract a number by 1 and do bitwise & with itself (n & (n-1)), we unset the righmost set bit. If we do n & (n-1) in a loop and count the no of times loop executes we get the set bit count.
		Beauty of the this solution is number of times it loops is equal to the number of set bits in a given integer.

		 
		   1  Initialize count: = 0
		   2  If integer n is not zero
		      (a) Do bitwise & with (n-1) and assign the value back to n
		          n: = n&(n-1)
		      (b) Increment count by 1
		      (c) go to step 2
		   3  Else return count
		 */
		
System.out.println("Solution 3:");		
		while(res!=0){
			
			res = res & (res-1);
			count ++;
		}
		
		System.out.println(count);
	}

}
