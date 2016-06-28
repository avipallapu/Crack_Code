package org.crack.code.Linkedl;

public class CircularLLCheck {

	public int getFirstNode(Node n){
		Node n2 = n;
		
		while(n!=null){
			if(n.getData() == n2.getData())
				return n.getData();
			n=n.getNext();
			n2=n2.getNext().getNext();
		}
		return 0;
	}
	
	public Node makeCirc(Node n){
		Node n2 = n;
		
		while(n.getNext()!=null){
			n=n.getNext();
		}
		n.setNext(n2);
		return n;
	}
	
	public static void main(String[] args) {
		Node n = new Node();
		Node n1= null;
		int[] a1 = {7,1,6,8,9};
		n1 = n.insertMulti(n1, a1);
		
		CircularLLCheck circularLLCheck = new CircularLLCheck();
		n1 = circularLLCheck.makeCirc(n1);
		System.out.println(circularLLCheck.getFirstNode(n1));
	}

}
