package org.crack.code.Linkedl;

public class LinkedListExercise {
	public static void main(String args[]){
		Node head = null;
		Node  n = new Node();
		int[] inserValues = {30,2,4,5,6};
		head = n.insertMulti(head, inserValues);
		n.write2Screen(head);

		//The next two lines check for any duplicates in the linked list and remove them 
		// To check, uncomment the next two lines and run 
		//n.removeDuplicates(head);
		//n.write2Screen(head);
		
		// Find the Kth element from the end of the list 
		//System.out.println(n.findKth(head, 4));
		
		// Delete the node from the list given only access to that node which exists in the middle of the list
		//n.deleteNodeMiddleOfList(head.getNext().getNext().getNext());
		//n.write2Screen(head);
		}	
}
