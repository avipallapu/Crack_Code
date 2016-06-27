package org.crack.code.Linkedl;
class Node{
	private int data;
	private Node next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node insert(Node head, int data){
		Node newNode = new Node();
		newNode.setData(data);
		if(head == null) { return newNode;}
		if(head.getNext()==null){
			head.setNext(newNode);
		}
		else{
			insert(head.getNext(), data);	
		}
		return head;
	}
	public void write2Screen(Node head){
		System.out.println("Nodes in linked list");
		while(head!=null){
			System.out.print(head.getData()+ " -> ");
			head=head.getNext();
		}
		System.out.print("NULL\n");
	}
	
	public Node removeDuplicates(Node head){
		if(head==null || head.getNext()==null) { return head; }
		Node curr = head;
		Node a = curr;
		
		while(curr!=null && curr.getNext()!=null){
			a = curr;
			while(a.getNext()!=null){
				if(a.getNext().getData() == curr.getData()){
					a.setNext(a.getNext().getNext()); 
					}
				else{
					a = a.getNext();
				}		
			}
			curr = curr.getNext();
		}
	return head;
	}

	public int findKth(Node head, int k){
		if(head==null || head.next==null) { return 0; }
		Node curr = head;
		int i=0;
		int j =i-k;
		while(head!=null && head.next!=null){
			i++;
			j++;
			if(j>=0){
				curr = curr.getNext();
			}
			
			head = head.getNext();
		}
		return curr.getData();
	}

}
public class LinkedListExercise {
	public static void main(String args[]){
		Node head = null;
		Node  n = new Node();
		head = n.insert(head, 3);
		head = n.insert(head, 4);
		head = n.insert(head, 33);
		head = n.insert(head, 3);
		head = n.insert(head, 3);
		n.write2Screen(head);
		//The next two lines check for any duplicates in the linked list and remove them 
		// To check, uncomment the next two lines and run 
		//n.removeDuplicates(head);
		//n.write2Screen(head);
		
		// Find the Kth element from the end of the list 
		System.out.println(n.findKth(head, 4));
		

	}
	

}
