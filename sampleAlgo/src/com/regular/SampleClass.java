package com.regular;


/*
 *class vairable is static variable
 *instance variable is normal var
 * Not all combinations of instance and class variables and methods are allowed:

Instance methods can access instance variables and instance methods directly.
Instance methods can access class variables and class methods directly.
Class methods can access class variables and class methods directly.
Class methods cannot access instance variables or instance methods directly—they must use an object reference. Also, class methods cannot use the this keyword as there is no instance for this to refer to.
*/



public class SampleClass {

	public static void main(String arg[]){
		
		abc temp=new abc();
		
		abc.sum(10, 20);
		
		System.out.println(temp.add(20, 30));
		
	}
	
}



class abc{
	
	static int c=20,d=40;
	int dummy = 100;
	
	public int add(int a,int b){
		c = 10;
		System.out.println(c);
		return a+b;
	}
	
	
	public static void sum(int c,int d){
		
		System.out.println(c+d);
	}
}