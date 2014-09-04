package com.arana.ds.reading0701;

// Singly linked list
public class SLinkedList {
	protected Node head;	// head node of the list
	protected static long size;	// number of nodes in the list
	
	/**
	 * Default constructor that creates an empty list
	 */
	public SLinkedList() {
		this.head = null;
		size = 0;
	}
	
	/**
	 * Inserts a new node v at the beginning of a singly linked list.
	 * @param v
	 */
	public void addFirst(Node v){
		// Make v point to the old head node
		v.setNext(this.head);
		// Make head point to the new node
		this.head = v;
		// Increment the node count
		size++;
	}
}