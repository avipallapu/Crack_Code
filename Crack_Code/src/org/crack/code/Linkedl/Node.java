package org.crack.code.Linkedl;

public class Node{
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
	
	public int getLength(Node n){
		if(n==null) { return 0; } 
		return 1+getLength(n.getNext());
	}
	
	// Insert into the Singly list Node 
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
	
	// Insert into the Singly list Node 
		public Node insertAtFront(Node head, int data){
			Node newNode = new Node();
			newNode.setData(data);
			if(head == null) { return newNode;}
			newNode.setNext(head);
			head = newNode;
			
			return head;
		}

	// Insert into the Singly list Node 
	public Node insertMulti(Node head, int[] x){
		for(int i : x){
			head = insert(head, i);
		}
		return head;
	}
	
	// print the contents into the Singly list Node
	public void write2Screen(Node head){
		System.out.println("Nodes in linked list");
		while(head!=null){
			System.out.print(head.getData()+ " -> ");
			head=head.getNext();
		}
		System.out.print("NULL\n");
	}
	
	//Check for any duplicates in the linked list and remove them 
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
	
	// Find the Kth element from the end of the list 
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

	public void deleteNodeMiddleOfList(Node beRemoved){
		beRemoved.setData(beRemoved.getNext().getData());
		beRemoved.setNext(beRemoved.getNext().getNext());
	}
}