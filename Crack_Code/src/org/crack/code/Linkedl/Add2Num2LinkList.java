package org.crack.code.Linkedl;

public class Add2Num2LinkList {

	public Node add2Num(Node n1, Node n2){
		Node addedList = null;
		Node n = new Node();
		
		int carry = 0;
		int sum = 0;		
		checkForPadding(n1,n2,n);
		
		while(n1!=null || n2!=null){
			sum = n1.getData()+n2.getData()+carry;
			if(sum > 10){
				addedList = n.insertAtFront(addedList, sum-10);
				carry = 1;
			}
			else{
				addedList = n.insertAtFront(addedList, sum);
				carry = 0;
			}
			n1 = n1.getNext();
			n2 = n2.getNext();
		}
		return addedList;
	}

	public static void checkForPadding(Node n1, Node n2, Node n){
		int n1l = n.getLength(n1);
		int n2l = n.getLength(n2);
		
		if(n1l < n2l){
			for(int i=0;i<n2l-n1l;i++){
				n1 = n.insert(n1,0);
			}
		}
		else{
			for(int i=0;i<n1l-n2l;i++){
				n2 = n.insert(n2,0);
			}
		}
	}
	
	public static void main(String[] args) {
		Node n = new Node();
		Add2Num2LinkList add = new Add2Num2LinkList();
		Node n1= null;
		Node n2= null;
		int[] a1 = {7,1,6,7,8};
		int[] a2 = {5,9,2};
		n1 = n.insertMulti(n1, a1);
		n2 = n.insertMulti(n2, a2);
		System.out.println("After adding the two Nodes in reverse order" );
		n.write2Screen(add.add2Num(n1,n2));
	}

}
