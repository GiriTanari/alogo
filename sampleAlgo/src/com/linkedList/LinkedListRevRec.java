package com.linkedList;

import com.linkedList.LinkedList.*;

public class LinkedListRevRec {

	
	public static void main(String arg[]){
		
		LinkedList llist = new LinkedList();
		
		llist.Head = new Node(10);
		Node first = new Node(20);
		Node second = new Node(30);
		
		llist.Head.next = first;
		first.next = second;
		
		llist.printInReverse(llist.Head);
		
	}
	
}
