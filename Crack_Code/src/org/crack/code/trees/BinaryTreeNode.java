package org.crack.code.trees;

import java.util.Stack;

class Node{
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String name){
		this.key = key;
		this.name = name;
	}
	
	public String toString(){
		return name+ " has a " +key;
	}
}



class BinaryTreeNode{
	Node root;
	
	public void addNode(int key, String name){
		Node newT = new Node(key, name);
		
		if(root == null) {  root = newT;  }
		else{
			Node focusNode = root;
			Node parent;
			
			while(true){
				parent = focusNode;
				if(key < focusNode.key){
					focusNode = focusNode.leftChild;
					if(focusNode == null){
						parent.leftChild = newT;
						return;
					}
				}
				else{
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parent.rightChild = newT;
						return;
					}
				}
			}
		}
	}	
	
	public void inOrder(Node root){
		if(root != null) { 
		
		inOrder(root.leftChild);
		System.out.println(root.toString());
		inOrder(root.rightChild);
		}
	}
	
	public void preOrder(Node root){
		if(root != null) {
		
		preOrder(root.leftChild);
		preOrder(root.rightChild);
		System.out.println(root.toString());
		}
	}
	
	public void postOrder(Node root){
		if(root != null) { 
		
		System.out.println(root.toString());
		postOrder(root.leftChild);
		postOrder(root.rightChild);
		}
	}
	
	public int checkHeight(Node root){
		if(root == null) { return 0; }
		else{
			return Math.max(checkHeight(root.leftChild), checkHeight(root.rightChild)) + 1;
		}
	}

	public void checkBalanced(Node root){
		Stack<Node> st = new Stack<>();
		st.add(root);
		Node parent;
		
		int leftLength = 0;
		int rightLength = 0;
		if(root==null) { 
			System.out.println("Tree has no elements"); 
			return; 
			} 
		
		while(!st.isEmpty()){
			parent = st.pop();
			if(parent.leftChild!=null) { 
				leftLength = checkHeight(parent.leftChild);
				st.add(parent.leftChild); 
			}
			if(parent.rightChild!=null) { 
				rightLength = checkHeight(parent.rightChild);
				st.add(parent.rightChild);
			}

			if(Math.abs(leftLength - rightLength) > 1){
				System.out.println("Not Balanced");
				return;
			}
		}
		
		System.out.println("Balanced");
		return;		
	}
}