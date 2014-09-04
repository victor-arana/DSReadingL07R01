package com.arana.ds.reading0701;
/**
 * Node of a singly list of strings
 * 
 * @author Victor Arana
 */
public class Node {
	private String element;	// we assume elements are character strings
	private Node next;
	
	/**
	 * Creates a node with the given element and next node
	 * @param element
	 * @param next
	 */
	public Node(String element, Node next) {
		this.element = element;
		this.next = next;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
