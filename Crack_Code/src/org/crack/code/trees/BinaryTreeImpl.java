package org.crack.code.trees;

public class BinaryTreeImpl {

	public static void main(String[] args) {
			BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
			
			binaryTreeNode.addNode(10, "A");
			binaryTreeNode.addNode(12, "B");
			binaryTreeNode.addNode(14, "C");
			binaryTreeNode.addNode(6, "D");
			binaryTreeNode.addNode(16, "E");
			binaryTreeNode.addNode(13, "F");
			binaryTreeNode.addNode(11, "G");
			binaryTreeNode.addNode(9, "H");
			
			int q = binaryTreeNode.checkHeight(binaryTreeNode.root);
			System.out.println("The height of the binary tree is: "+q);
			binaryTreeNode.preOrder(binaryTreeNode.root);
			System.out.println("\n");
			binaryTreeNode.inOrder(binaryTreeNode.root);
			System.out.println("\n");
			binaryTreeNode.postOrder(binaryTreeNode.root);
	}

}
