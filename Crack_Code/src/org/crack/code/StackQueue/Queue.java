package org.crack.code.StackQueue;

import org.crack.code.Linkedl.Node;

public class Queue {
	Node first, last;
	
	void enqueue(int item){
		if(first == null){
			last = new Node();
			last.setData(item);
			first = last;
		}
		else{
			Node t = new Node();
			t.setData(item);
			last.setNext(t);
			last = last.getNext();
		}
	}
	
	Object dequeue(){
		if(first != null){
			int item = first.getData();
			first = first.getNext();
			return item;
		}
		return null;
	}
}
