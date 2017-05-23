package com.stringManpulation;

public class ReverseWords {
	
/*	Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

	Example 1:
	Input: "Let's take LeetCode contest"
	Output: "s'teL ekat edoCteeL tsetnoc"*/	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Let's take LeetCode contest";
		
//Approch 1: Split by " " and reverse it and add them using String Builder		
		int i,j;
		StringBuilder strBuilder = new StringBuilder();
		String words[]=str.split(" ");
		for(i=0;i<words.length;i++){
			for(j=words[i].length()-1;j>=0;j--){
				
				strBuilder.append(words[i].charAt(j));
			}
			if(i != (words.length)-1)
			strBuilder.append(" ");
		}
	
		System.out.println(strBuilder);
		
		
		
//Approch 2 : read string and define rev fun ==> use the Merge soer mech === > Temp
		
		int start=0,mid=0;
		StringBuilder strBuilder1 = new StringBuilder(str);
		System.out.println("approch 2" + strBuilder1);
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ' || i == (str.length()-1)){
				
				mid = (str.charAt(i) == ' ') ? i-1 : i;
				
				char temp;
				while(start < mid){
					temp = strBuilder1.charAt(start);
					strBuilder1.setCharAt(start++, strBuilder1.charAt(mid));
					strBuilder1.setCharAt(mid--, temp);
				}
				
				start = i+1;
			}
		}
		
		System.out.println(strBuilder1);
	}
	
	
}
