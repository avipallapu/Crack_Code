package org.crack.code.StackQueue;

import org.crack.code.Linkedl.Node;

public class Stack {
	Node top;
	
	Object pop(){
		if(top!=null){
			Object item = top;
			top = top.getNext();
			return item;
		}
		return null;
	}
	
	void push(int item){
		Node t = new Node();
		t.setData(item);
		t.setNext(top);
		top = t;
	}
	
	Object peek(){
		return top.getData();
	}
	
	
}
