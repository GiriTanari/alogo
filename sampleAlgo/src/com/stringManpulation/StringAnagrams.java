package com.stringManpulation;

public class StringAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ac",t="bb";
		int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) System.out.println("not match");
        System.out.println("match");

}
}
