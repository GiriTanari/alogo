package com.general;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import sun.reflect.generics.tree.IntSignature;

public class DistributeCandies {
	
	
/*	Given an integer array with even length, where different numbers in this array represent different kinds of candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.
	
	Example 2:
		Input: candies = [1,1,2,3]
		Output: 2
		Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1]. 
		The sister has two different kinds of candies, the brother has only one kind of candies. 
*/		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Approch 1: using Hash set
//Math.min((candies.length/2), kinds.size())		
		
		int candies[] = {1,1,2,3,1,1,1,5,5,5};
		HashSet<Integer> kinds = new HashSet<Integer>();
		
		for(int a:candies){
			kinds.add(a);
		}
		
		System.out.println(Math.min((candies.length/2), kinds.size()));

	
//Approch 2: direct assign not hash set
//IN Java 8 : Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );		
		
//		HashSet<Integer> kinds1 = new HashSet<Integer>(Arrays.asList(candies));
		
		HashSet<Integer> kinds1 = new HashSet<Integer>();
		//kinds1.addAll(Arrays.asList(candies));
		System.out.println(Math.min((candies.length/2), kinds1.size()));
		
	
		
//Aproch 3:
		
		Arrays.sort(candies);
		
		int len = candies.length;

		int kindsLen = 1;		
		if(len!=0){

		for(int i=0;i<len-1;i++){
			
			if(candies[i]!=candies[i+1])
				kindsLen++;
			}
		}
		else{
			
		}
		System.out.println(Math.min((candies.length/2), kindsLen));
	}

	
}
