package org.crack.code.Linkedl;

import java.util.Stack;

public class PalindromeLL {
	public boolean checkPalin(Node n1, Node n){
		if(n1==null || n1.getNext()==null) { return true; }
		
		Node n2 = n1;		
		int fhalf = 0;
		int shalf = 0;
		Stack<Node> s = new Stack<>();
		
		int nl = n.getLength(n1);
		if(nl%2 == 0){
			shalf = nl - nl/2;
		}
		else{
			shalf = nl - nl/2-1;
		}
		
		while(shalf < nl){
			n2=n2.getNext();
			shalf++;
		}
		
		while(fhalf < nl/2){
			s.push(n1);	
			n1 = n1.getNext();
			fhalf++;
		}
		
		while(n2!=null){
			if(n2.getData() != s.pop().getData())
				return false;
			n2=n2.getNext();
		}
		return true;
	}
	
	
	public static void main(String[] args){
		PalindromeLL palindromeLL = new PalindromeLL();
		Node n = new Node();
		Node n1 = null;
		int[] ar = {1,2,2,2,2,1};
		n1 = n.insertMulti(n1, ar);
		boolean result = palindromeLL.checkPalin(n1,n);
		String res = (result==true) ? "List is a Palindrome" : "List is not a Palindrome";
		System.out.println(res);
	}

}
