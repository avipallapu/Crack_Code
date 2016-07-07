package org.crack.code.trees;

public class BinaryTreeImpl {

	public static void main(String[] args) {
			BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
			
			binaryTreeNode.addNode(10, "A");
			binaryTreeNode.addNode(12, "B");
			binaryTreeNode.addNode(14, "C");
			binaryTreeNode.addNode(9, "C");
			binaryTreeNode.addNode(16, "C");
			
			int q = binaryTreeNode.checkHeight(binaryTreeNode.root);
			System.out.println("The height of the binary tree is: "+q);
			binaryTreeNode.preOrder(binaryTreeNode.root);
			System.out.println("\n");
			binaryTreeNode.inOrder(binaryTreeNode.root);
			System.out.println("\n");
			binaryTreeNode.postOrder(binaryTreeNode.root);
			System.out.println("\nChecking if tree is balanced ");
			binaryTreeNode.checkBalanced(binaryTreeNode.root);
	}

}
