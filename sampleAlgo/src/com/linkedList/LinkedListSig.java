package com.linkedList;

import com.linkedList.LinkedListSig.Node;


//as an inner class, which (by definition) is associated with a particular instance of Hello (even if it never uses or refers to it), which means it's an error to say new Thing(); without having a particular Hello instance in scope.


public class LinkedListSig {
	
	Node Head;
	
	static class Node{	
		int data;
		Node next;
		
		Node(){
			
		}
		Node(int a){
			data = a;
		}
	}

}

class abc{
	
	public static void main(String ar[]){

		LinkedListSig llist=new LinkedListSig();
		abc a= new abc();
//Created nodes and added to Header		
		llist.Head = new Node(10);
		Node first = new Node(20);
		Node second = new Node(30);

//Map the link between nodes
		llist.Head.next = first;
		first.next = second;
		second.next = null;
	
		a.printLl(llist.Head);
	}
	
	public void printLl(Node abc){
		
		Node temp = abc;
		
		while(temp != null){
			
			System.out.print(temp.data + " " );
			temp = temp.next;
		}
	}
}