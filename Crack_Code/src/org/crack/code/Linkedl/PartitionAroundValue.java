package org.crack.code.Linkedl;

public class PartitionAroundValue {
	
	public static Node partitionAround(Node head, int k){
		if(head==null && head.getNext()==null) { return head; }
		
		Node n = new Node();
		Node n1 =null;
		Node n2 =null;
		
		while(head!=null){
			if(head.getData() < k){
				n1 = n.insert(n1, head.getData());
			}
			else{
				n2 = n.insert(n2, head.getData());
			}		
			head = head.getNext();
		}
		
		if(n1!=null){
			Node n1return = n1;
			while(n1.getNext()!=null){
				n1=n1.getNext();
			}
			n1.setNext(n2);
			return n1return;
		}
		return n2;
	}
	

	public static void main(String[] args) {
		Node head = null;
		Node  n = new Node();

		int[] inserValues = {30,23,4,5,6,11};
		head = n.insertMulti(head, inserValues);
		//n.write2Screen(head);
		n.write2Screen(partitionAround(head, 10));

		
	}

}
