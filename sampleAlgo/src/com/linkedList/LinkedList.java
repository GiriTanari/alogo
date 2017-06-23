package com.linkedList;

public class LinkedList {
	
	Node Head;
	
	static class Node{
		
		Node next;
		int data;
		
		public Node(int a){
			data = a;
		}
		
	}
	
	public void printInReverse(Node n){
		
		if(n ==  null)
			return;
	
		printInReverse(n.next);
		System.out.print(n.data);
		
	}

}
