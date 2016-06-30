package org.crack.code.StackQueue;

import java.util.Stack;

//Sorting a stack using only one another stack 

public class SortaStack {

	public Stack<Integer> sortIt(Stack<Integer> s){
		Stack<Integer> r = new Stack<Integer>();
		Integer tmp;
		while(!s.isEmpty()){
			tmp = s.pop();
			while(!r.isEmpty() && r.peek() > tmp){
				s.push(r.pop());
			}
			r.push(tmp);
		}
		return r;
	}
	
	
	public static void main(String[] args) {
		SortaStack sortaStack =  new SortaStack();
		
		Stack<Integer> s = new Stack<>();
		s.push(new Integer(4));
		s.push(new Integer(10));
		s.push(new Integer(2));
		s.push(new Integer(6));
		s.push(new Integer(40));
		s.push(new Integer(100));
		s.push(new Integer(20));
		s.push(new Integer(60));
		s = sortaStack.sortIt(s);
		System.out.println(s);
	}

}
