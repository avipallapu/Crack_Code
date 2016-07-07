package org.crack.code.trees;

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
		if(root == null) { return;  }
		
		inOrder(root.leftChild);
		System.out.println(root.toString());
		inOrder(root.rightChild);
	}
	
	public void preOrder(Node root){
		if(root == null) { return;  }
		
		preOrder(root.leftChild);
		preOrder(root.rightChild);
		System.out.println(root.toString());
	}
	
	public void postOrder(Node root){
		if(root == null) { return;  }
		
		System.out.println(root.toString());
		postOrder(root.leftChild);
		postOrder(root.rightChild);
	}
	
	public int checkHeight(Node r){
		if(r == null) { return 0; }
		else{
			return Math.max(checkHeight(r.leftChild), checkHeight(r.rightChild)) + 1;
		}
	}
}
